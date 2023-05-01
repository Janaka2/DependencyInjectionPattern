package org.example;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending email to " + recipient + " with message: " + message);
    }
}

