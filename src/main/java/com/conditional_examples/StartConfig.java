package com.conditional_examples;

import org.springframework.cache.annotation.AbstractCachingConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class StartConfig {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(StartConfig.class);
    }
}
