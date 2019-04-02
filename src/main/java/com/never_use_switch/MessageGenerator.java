package com.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */

@Service
public class MessageGenerator {
    private Random random = new Random();

    @Autowired
    private MessageSender sender;

    private int i;

    @Scheduled(fixedDelay = 1000)
    public void generate(){
        sender.sendMessage("message id= "+(i++),random.nextInt(3)+1);
    }
}
