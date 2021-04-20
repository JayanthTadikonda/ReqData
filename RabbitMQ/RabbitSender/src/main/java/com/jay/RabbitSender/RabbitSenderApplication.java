package com.jay.RabbitSender;

import com.jay.RabbitSender.model.Customer;
import com.jay.RabbitSender.repository.CustomerRepository;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class RabbitSenderApplication {

	@Autowired
	private static CustomerRepository customerRepository;

	public static void main(String[] args) throws Exception{
		SpringApplication.run(RabbitSenderApplication.class, args);

	}

}
