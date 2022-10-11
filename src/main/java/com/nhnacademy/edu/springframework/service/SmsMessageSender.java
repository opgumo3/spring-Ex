package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.DisposableBean;

public class SmsMessageSender implements MessageSender, DisposableBean {

  public SmsMessageSender() {
    System.out.println("SmsMessageSender Initialized!");
  }

  @Override
  public void sendMessage(User user, String message) {
    System.out.println(user.getPhoneNumber() + " : " + message);
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("Sms Message Sender destroy method called.!");
  }
}
