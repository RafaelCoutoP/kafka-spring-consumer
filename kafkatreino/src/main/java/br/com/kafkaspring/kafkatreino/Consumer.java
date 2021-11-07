package br.com.kafkaspring.kafkatreino;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Consumer {

    AtomicInteger coffersIncrement = new AtomicInteger(0);
    @KafkaListener(id = "super.coffer", topics = "coffers")
    public void coffers(Coffer coffer){
        System.out.println("coffer = " + coffer);
        coffersIncrement.incrementAndGet();
    }
}