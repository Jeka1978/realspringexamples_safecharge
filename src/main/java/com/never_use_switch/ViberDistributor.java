package com.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class ViberDistributor implements MessageDistributor {
    @Override
    public void distribute(String message) {
        System.out.println(message+" sent by VIBER");
    }
}
