package com.nhnacademy.edu.springframework.test;

public class testObject {

  static int number = 0;

  public void addNum() {
    number++;
    System.out.println(getClass().getSimpleName() + " : " + number);
  }
}
