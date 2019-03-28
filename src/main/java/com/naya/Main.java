package com.naya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person person = context.getBean(Person.class);
        System.out.println("person = " + person);
    }
}
