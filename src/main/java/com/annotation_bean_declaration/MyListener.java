package com.annotation_bean_declaration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */


//@Component  you can use @EventListener instead
public class MyListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private SuperService superService;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        superService.doWork();
    }
}
