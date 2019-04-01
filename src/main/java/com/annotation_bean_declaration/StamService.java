package com.annotation_bean_declaration;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@SafechargeComponent
public class StamService {

    public StamService() {
        System.out.println("stam service was created");
    }

    @PostConstruct
    public void init(){
        System.out.println("stam service init mehod is working");
    }


    public void help(){
        System.out.println("I'm you best friend");
    }

}
