package com.never_use_switch;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static com.never_use_switch.DistributionType.SMS;

/**
 * @author Evgeny Borisov
 */
@Component(SMS)
public class SmsDistributor implements MessageDistributor {
    @Override
    public void distribute(String message) {
        System.out.println(message+" was sent by sms");
    }
}
