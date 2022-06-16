package com.feleke.eyoel.sfgdi;

import com.feleke.eyoel.sfgdi.contorllers.ConstructorInjectedController;
import com.feleke.eyoel.sfgdi.contorllers.MyController;
import com.feleke.eyoel.sfgdi.contorllers.PropertyInjectedController;
import com.feleke.eyoel.sfgdi.contorllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

    MyController myController = (MyController) context.getBean("myController");

    String greeting = myController.sayHello();

    System.out.println(greeting);

    System.out.println("----------- Spring Framework DI ----------- ");

    System.out.println("----------- Property Injected ----------- ");

    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean(
        "propertyInjectedController");

    System.out.println(propertyInjectedController.getGreeting());

    System.out.println("----------- Setter Injected ----------- ");

    SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean(
        "setterInjectedController");
    System.out.println(setterInjectedController.getGreeting());

    System.out.println("----------- Constructor Injected ----------- ");

    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean(
        "constructorInjectedController");

    System.out.println(constructorInjectedController.getGreeting());

  }

}
