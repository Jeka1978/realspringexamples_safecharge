package com.conditional_examples;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@ProdEnv
public class SomeService {
    @PostConstruct
    public void init() {
        System.out.println("Some service was created");
    }

}
