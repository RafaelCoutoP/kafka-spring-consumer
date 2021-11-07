package br.com.kafkaspring.kafkatreino;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.test.context.EmbeddedKafka;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@EmbeddedKafka(brokerProperties = { "listeners=PLAINTEXT://localhost:9092", "port=9092" })
class ConsumerTest {

    @Autowired
    KafkaTemplate<String, String> kafkaProducer;
    @Autowired
    Consumer consumer;

    ObjectMapper jsonMapper = new ObjectMapper();

    @Test
    void testKafka() throws JsonProcessingException, InterruptedException {
        String json = jsonMapper.writeValueAsString(new Coffer(1, "Tokyo Lungo", 3));
        kafkaProducer.send("coffers", json);

        Thread.sleep(1000);

        assertTrue(consumer.coffersIncrement.get() == 1);
    }
}