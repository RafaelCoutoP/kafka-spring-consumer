package br.com.kafkaspring.kafkatreino;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    // ao executar duas instancias de um consumer ele rebalanceia as particões
    @KafkaListener(id = "super.coffer", topics = "coffers")
    public void coffers(Coffer coffer){
        System.out.println("coffer = " + coffer);
        //{"id":1, "name":"Colombia Coffer", "age": 5}
    }
}