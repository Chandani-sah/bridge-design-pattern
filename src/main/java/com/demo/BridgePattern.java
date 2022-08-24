package com.demo;

public class BridgePattern {
    public static void  main(String[] args) {
        Message textMessage = new TextMessage(new TextMessageSender());
        textMessage.send();
        Message emailMessage = new EmailMessage(new EmailMessageSender());
        emailMessage.send();
    }
}
