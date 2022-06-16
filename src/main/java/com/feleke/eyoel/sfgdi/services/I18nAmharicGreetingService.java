package com.feleke.eyoel.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("AM")
@Service("i18nGreetingService")
public class I18nAmharicGreetingService implements GreetingService {

  @Override
  public String sayHello() {
    return "ሰላም ዓለም - AM";
  }
}
