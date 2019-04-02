package com.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("2")
public class WhatsAppDistributor implements MessageDistributor {
    @Override
    public void distribute(String message) {
        System.out.println(message+" was sent by whatsApp");
    }
}
