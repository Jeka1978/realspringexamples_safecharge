package com.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */

@Service
public class MessageSender {

    private Map<Integer, MessageDistributor> distributors = new HashMap<>();

    @Autowired
    public void initMap(List<MessageDistributor> list) {
        distributors = list.stream().collect(toMap(MessageDistributor::myCode, d -> d));

    }


    public void sendMessage(String message, int type) {
        MessageDistributor messageDistributor = distributors.get(type);
        if (messageDistributor == null) {
            throw new UnsupportedOperationException(type + " not supported yet");
        }
        messageDistributor.distribute(message);

    }
}
