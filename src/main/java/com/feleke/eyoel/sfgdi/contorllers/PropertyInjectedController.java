package com.feleke.eyoel.sfgdi.contorllers;

import com.feleke.eyoel.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

  @Qualifier("propertyInjectedGreetingService")
  @Autowired
  GreetingService greeting;

  public String getGreeting() {
    return greeting.sayHello();
  }
}
