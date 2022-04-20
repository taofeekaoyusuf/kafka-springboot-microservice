package com.dhackbility;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "dhackbility",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("\nListener received: "+data+" \n");
    }
}
