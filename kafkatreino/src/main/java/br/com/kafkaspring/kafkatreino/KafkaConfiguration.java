package br.com.kafkaspring.kafkatreino;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
public class KafkaConfiguration {

    @Bean
    // kafka -> string -> json -> Coffer? = convertendo o que o kafka entregou(JSON), e transforma para o Objeto alvo
    public StringJsonMessageConverter jsonMessageConverter(){
        return new StringJsonMessageConverter();
    }
}
