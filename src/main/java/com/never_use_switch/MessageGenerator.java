package com.never_use_switch;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */

public class MessageGenerator {
    private Random random = new Random();

    private MessageSender sender;
    @Scheduled(fixedDelay = 1000)
    public void generate(){
        sender.sendMail(random.nextInt(2)+1);
    }
}
