package com.dhackbility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class KafkaSpringbootMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringbootMicroserviceApplication.class, args);
    }

    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("dhackbility", "Assallaam alaykum Yusuf");
        };
    }
}
