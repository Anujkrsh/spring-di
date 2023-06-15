package com.olive.springdi;

import com.olive.springdi.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

		MyController myController =(MyController) context.getBean("myController");

		String greet =myController.sayHello();

		System.out.println(greet);

	}

}
