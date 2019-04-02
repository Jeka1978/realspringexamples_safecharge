package com.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ViberDistributor implements MessageDistributor {
    @Override
    public void distribute(String message) {
        System.out.println(message+" sent by VIBER");
    }

    @Override
    public int myCode() {
        return 3;
    }
}
