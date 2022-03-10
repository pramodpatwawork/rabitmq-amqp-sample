package com.mywork.pp.rabitmq.amqp.sample;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabitmqAmqpSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabitmqAmqpSampleApplication.class, args);
	}

}
