package com.feleke.eyoel.sfgdi.contorllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String sayHello() {
    System.out.println("Hello World");
    return "Greeting from the controller";
  }
}
