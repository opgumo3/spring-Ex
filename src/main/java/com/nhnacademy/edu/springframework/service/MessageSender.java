package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {

  void sendMessage(User user, String message);
}