package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender {

  public EmailMessageSender() {
    System.out.println("EmailMessageSender Initialized!");
  }

  @Override
  public void sendMessage(User user, String message) {
    System.out.println(user.getPhoneNumber() + " : " + message);
  }
}
