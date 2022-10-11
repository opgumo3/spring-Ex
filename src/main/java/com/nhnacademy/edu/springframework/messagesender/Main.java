package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSenderService;
import com.nhnacademy.edu.springframework.service.SmsMessageSender;

public class Main {

  public static void main(String[] args) {
    new MessageSenderService(new SmsMessageSender()).doSendMessage();
    new MessageSenderService(new EmailMessageSender()).doSendMessage();
  }
}
