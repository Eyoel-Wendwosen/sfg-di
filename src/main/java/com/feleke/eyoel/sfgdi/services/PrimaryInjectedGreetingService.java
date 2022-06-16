package com.feleke.eyoel.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryInjectedGreetingService implements GreetingService{
  GreetingService greetingService;

  @Override
  public String sayHello() {
    return "Hello from Primary";
  }
}
