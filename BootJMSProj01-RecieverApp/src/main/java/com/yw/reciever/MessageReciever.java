package com.yw.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReciever {

    @JmsListener(destination = "test-queue2")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}