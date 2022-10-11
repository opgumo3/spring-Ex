package com.nhnacademy.edu.springframework.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.service.MessageSender;
import com.nhnacademy.edu.springframework.service.MessageSenderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    // 이 떄 bean 객체가 생성, 조립 됨.
    // 이 emailMessageSender는 이 context 내에서만 싱글톤. > thread safe하게 만들어야한다.
    // 싱글턴이면 이 context가 생성될 때, 같이 생서되고 계속 돌려쓸거임.
    // 근데 prototype이라면 getBean이라 했을 떄, 생성되고 사용되다가 종료도면 소멸함.

    MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
    MessageSender emailMessageSender1 = context.getBean("emailMessageSender", MessageSender.class);
    MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
    MessageSender smsMessageSender1 = context.getBean("smsMessageSender", MessageSender.class);

    MessageSenderService service = context.getBean("messageSenderService",
        MessageSenderService.class);

    emailMessageSender.sendMessage(new User("opgumo@naver.com", "0000"), "this is message");

  }
}
