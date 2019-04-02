package com.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@Service
public class MessageSender {

    @Autowired
    private Map<String,MessageDistributor> distributors;

    public void sendMessage(String message, int type) {
        MessageDistributor messageDistributor = distributors.get(Integer.toString(type));
        if (messageDistributor == null) {
            throw new UnsupportedOperationException(type + " not supported yet");
        }
        messageDistributor.distribute(message);

    }
}
