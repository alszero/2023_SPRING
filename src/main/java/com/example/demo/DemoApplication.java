package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//hello패키지 불러오기
//@ComponentScan(basePackages = {"com.example.demo", "hello"})
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.getClass().getName());
		String[] beanNames = context.getBeanDefinitionNames();
		// 확인해보기
		for (String beanName : beanNames) {
			if(!beanName.startsWith("org.") && !beanName.startsWith("spring.")) {
				System.out.println(beanName);
			}
		}

		MyBean myBean = (MyBean) context.getBean("myBean"); //object로 변환이 되어있어서 형변환 시켜죠야함
		Person person = (Person) context.getBean("person");
		//var person = (Person) context.getBean("helloMyPerson");
		System.out.println(person);
		var calculatorService = (MyCalculatorService) context.getBean(MyCalculatorService.class);
		calculatorService.calcAdd(5,3);
	}

}
