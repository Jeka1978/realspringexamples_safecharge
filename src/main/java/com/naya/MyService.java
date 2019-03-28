package com.naya;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyService {

    @Scheduled(fixedDelay = 1000)
    public void goSmoke(){
        System.out.println("Let's smoke something");
    }
}
