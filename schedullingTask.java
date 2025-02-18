package org.example.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class schedullingTask {

    @Scheduled(fixedRate = 60000)
    public void task(){
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Scheduled at " + currentTime);
    }


}
