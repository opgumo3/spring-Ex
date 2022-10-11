package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.DisposableBean;

public class EmailMessageSender implements MessageSender, DisposableBean {

  public EmailMessageSender() {
    System.out.println("EmailMessageSender Initialized!");
  }

  public void init() {
    System.out.println("EmailMessageSender Init method called!");
  }

  @Override
  public void sendMessage(User user, String message) {
    System.out.println(user.getEmail() + " : " + message);
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("destroy method called in EmailMessageSender");
  }
}
