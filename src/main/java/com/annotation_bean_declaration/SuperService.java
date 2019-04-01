package com.annotation_bean_declaration;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class SuperService {

    private StamService stamService;

    @Autowired
    public SuperService(StamService stamService) {
        this.stamService = stamService;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void doWork(){
        System.out.println("I'm in work");
        stamService.help();
    }
}
