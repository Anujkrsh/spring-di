package com.olive.springdi;

import com.olive.springdi.Controllers.ConstructorInjectedController;
import com.olive.springdi.Controllers.MyController;
import com.olive.springdi.Controllers.PropertyInjectedController;
import com.olive.springdi.Controllers.SetterInjectedController;
import com.olive.springdi.Controllers.I18nController;
import com.olive.springdi.services.PrimaryGreetingServiceImpl;
import com.olive.springdi.services.PrototypeBean;
import com.olive.springdi.services.SingeltonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

		System.out.println("------Language Skill");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController =(MyController) context.getBean("myController");

		System.out.println("------ Primary");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


		SingeltonBean singeltonBean1 = context.getBean(SingeltonBean.class);
		System.out.println(singeltonBean1.getMyScope());
		SingeltonBean singeltonBean2 = context.getBean(SingeltonBean.class);
		System.out.println(singeltonBean2.getMyScope());

		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.getMyScope());
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());

	}

}
