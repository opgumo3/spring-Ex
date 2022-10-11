package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender {

  public SmsMessageSender() {
    System.out.println("SmsMessageSender Initialized!");
  }

  @Override
  public void sendMessage(User user, String message) {
    System.out.println(user.getEmail() + " : " + message);
  }
}
