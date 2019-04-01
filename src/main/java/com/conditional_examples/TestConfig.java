package com.conditional_examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:test.properties")
@TestEnv
public class TestConfig {
    @Bean
    public MyService myService(){
        return new MyServiceMock();
    }
}
