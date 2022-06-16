package com.feleke.eyoel.sfgdi.contorllers;

import com.feleke.eyoel.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

  private final GreetingService greetingService;

  public I18nController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayHello();
  }
}
