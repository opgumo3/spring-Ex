package com.nhnacademy.edu.springframework.test;

public class testMain {

  static int i = 1;

  public static void main(String[] args) {
    testObject object1 = new testObject();
    testObject object2 = new testObject();
    object1.addNum();
    object2.addNum();
    object1.addNum();
    System.out.println(++i);
  }

}
