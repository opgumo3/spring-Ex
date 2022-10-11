package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSenderService {

  MessageSender messageSender;

  public MessageSenderService() {

  }

  public MessageSenderService(MessageSender messageSender) {
    this.messageSender = messageSender;
  }

  public void doSendMessage() {
    messageSender.sendMessage(new User("a@a.com", "010-0000-0000"), "this is message!");
  }
}
