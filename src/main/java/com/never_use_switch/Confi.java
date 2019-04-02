package com.never_use_switch;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class Confi {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Confi.class);
    }




}
