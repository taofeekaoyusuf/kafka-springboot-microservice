package com.dhackbility.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean // Added for Instantiation of the Topic Builder
    public NewTopic dhackbilityTopic(){
        return TopicBuilder.name("dhackbility").build();
    }
}
