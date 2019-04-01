package com.never_use_switch;

/**
 * @author Evgeny Borisov
 */

public class MessageSender {

    public void sendMail(int type) {
        if (type == 1) {
            System.out.println("sms was sent");
        }
        if(type==2){
            System.out.println("mail was sent");
        }
    }
}
