package com.jay.RabbitSender.controller;

import com.jay.RabbitSender.model.Customer;
import com.jay.RabbitSender.repository.CustomerRepository;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.nio.charset.StandardCharsets;

@RestController
public class CustomerController{

    @Autowired
    private CustomerRepository customerRepository;

    private static final String qname = "demo";
    private static final String EXCHANGE_NAME = "logs";

    @RequestMapping("/")
    public String home(){
        return "Welcome Customer !";
    }

    @PostMapping("/send")
    public String sendData(@RequestBody String name){
        ConnectionFactory factory = new ConnectionFactory();

        factory.setHost("localhost");

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel())

        {
            channel.queueDeclare(qname,false,false,false,null);
            channel.basicPublish("",qname,null, name.getBytes(StandardCharsets.UTF_8));
            System.out.println("Sent Message is: " + name);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return "DATA SENT by Producer(Customer Added)";
    }

    @RequestMapping(value = "/add")
    public String addCustomer(Customer customer) throws Exception{
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(qname,false,false,false,null);
        System.out.println("Waiting for messages from Sender, ctrl+c to quit");

        DeliverCallback deliverCallback = (ct, delivery)-> {
            String msg = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println("Received Message is: "+ msg);

            customer.setName(msg);
            customerRepository.save(customer);
        };
        channel.basicConsume(qname,true, deliverCallback, c->{});

        return "Added Customer";
    }

    @GetMapping("/logs")
    public void logInfo() throws Exception{
        String[] argv = new String[0];
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

            String message = argv.length < 1 ? "info: Hello World!" :
                    String.join(" ", argv);

            channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes("UTF-8"));
            System.out.println(" [x] Sent '" + message + "'");
        }

    }

}
