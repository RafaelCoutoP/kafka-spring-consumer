package br.com.kafkaspring.kafkatreino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@SpringBootApplication
public class KafkatreinoApplication {
	//{"id":2, "name":"Shanghai Lungo", "age":2}
	public static void main(String[] args) {
		SpringApplication.run(KafkatreinoApplication.class, args);
	}
}
