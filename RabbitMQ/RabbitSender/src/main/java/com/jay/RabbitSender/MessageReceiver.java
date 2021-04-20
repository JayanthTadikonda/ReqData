package com.jay.RabbitSender;

import com.jay.RabbitSender.model.Customer;
import com.jay.RabbitSender.repository.CustomerRepository;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.amqp.support.ConsumerTagStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class MessageReceiver{

    private static final String qname = "demo";

    @Autowired
    private static CustomerRepository customerRepository;

    private static String main_msg = "";

    public static void main(String[] args) throws Exception {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(qname,false,false,false,null);
        System.out.println("Waiting for messages from Sender, ctrl+c to quit");

        DeliverCallback deliverCallback = (ct, delivery)-> {
            String msg = new String(delivery.getBody(), StandardCharsets.UTF_8);
            System.out.println("Received Message is: "+ msg);
            main_msg = msg;

            Customer customer = new Customer();
            customer.setName(main_msg);
            customerRepository.save(customer);

        };
       channel.basicConsume(qname,true, deliverCallback, c->{});

    }

}
