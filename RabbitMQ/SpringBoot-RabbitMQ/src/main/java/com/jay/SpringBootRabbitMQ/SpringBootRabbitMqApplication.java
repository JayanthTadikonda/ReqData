package com.jay.SpringBootRabbitMQ;

import com.jay.SpringBootRabbitMQ.model.Car;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitMqApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitMqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Car car = new Car();
		car.setName("FocusRS");
		car.setNumber(1234);

		System.out.println("Sending Message!");

		rabbitTemplate.convertAndSend(RabbitConfig.topicExchangeName,"SomeDummyKey", "FORDMOTOR Focus RS");
		System.out.println("Message SENT !");
	}
}
