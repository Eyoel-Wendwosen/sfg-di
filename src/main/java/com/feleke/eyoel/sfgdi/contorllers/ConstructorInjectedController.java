package com.feleke.eyoel.sfgdi.contorllers;

import com.feleke.eyoel.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  GreetingService greeting;

  public ConstructorInjectedController(
      @Qualifier("constructorInjectedGreetingService") GreetingService greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting.sayHello();
  }
}
