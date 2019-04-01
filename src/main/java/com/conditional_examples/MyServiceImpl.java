package com.conditional_examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */


public class MyServiceImpl implements MyService {
    @Value("${message}")
    private String message;
    @Override
    @EventListener(ContextRefreshedEvent.class)
    public void work() {
        System.out.println("Working in prod");
        System.out.println(message);
    }
}
