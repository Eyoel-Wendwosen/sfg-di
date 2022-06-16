package com.feleke.eyoel.sfgdi.contorllers;

import com.feleke.eyoel.sfgdi.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectedController(new PropertyInjectedGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}