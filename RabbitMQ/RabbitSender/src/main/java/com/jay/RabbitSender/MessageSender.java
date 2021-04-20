package com.jay.RabbitSender;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;

public class MessageSender {

    private final static String queueName = "demo";
   // private final static String exchangeName = "headers";

    public static void main(String[] args) {

        ConnectionFactory factory = new ConnectionFactory();

        factory.setHost("localhost");

           try (Connection connection = factory.newConnection();
            Channel channel = connection.createChannel())
           //channel.exchangeDeclare()exchangeName,"headers")

           {
               channel.queueDeclare(queueName,false,false,false,null);
               String message = "Kate Pearson";
               channel.basicPublish("",queueName,null, message.getBytes(StandardCharsets.UTF_8));
               System.out.println("Sent Message is: " + message);
           }
           catch (Exception exception){
               exception.printStackTrace();
           }
    }
}
