package com.nhnacademy.edu.springframework.xml;

import com.nhnacademy.edu.springframework.service.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSenderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain3 {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    // new EmailMessageSender();
    MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
    MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);

    MessageSenderService service = context.getBean("messageSenderService",
        MessageSenderService.class);
    // new MessageSenderService(new SmsMessageSender()).doSendMessage();
    service.doSendMessage();
    context.close();
  }
}
