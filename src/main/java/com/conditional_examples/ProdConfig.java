package com.conditional_examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ProdEnv
@PropertySource("classpath:prod.properties")
public class ProdConfig {
    @Bean
    public MyService myService(){

        return new MyServiceImpl();
    }
}
