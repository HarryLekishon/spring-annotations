package com.example.springannotations;

import com.example.springannotations.controller.MyController;
import com.example.springannotations.controller.PizzaController;
import com.example.springannotations.cope.PrototypeBean;
import com.example.springannotations.cope.SingletonBean;
import com.example.springannotations.lazy.LazyLoader;
import com.example.springannotations.repository.MyRepository;
import com.example.springannotations.service.MyService;
import com.example.springannotations.service.VegPizza;
import com.example.springannotations.value.ValueAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var  ConfigurableApplicationContext = SpringApplication.run(SpringAnnotationsApplication.class, args);

		ValueAnnotation valueAnnotation = ConfigurableApplicationContext.getBean(ValueAnnotation.class);
		System.out.println(valueAnnotation.getDefaultName());
		System.out.println(valueAnnotation.getEmail());
		System.out.println(valueAnnotation.getHost());
		System.out.println(valueAnnotation.getPassword());

//		SingletonBean singletonBean = ConfigurableApplicationContext.getBean(SingletonBean.class);
//		SingletonBean singletonBean2 = ConfigurableApplicationContext.getBean(SingletonBean.class);
//		SingletonBean singletonBean3 = ConfigurableApplicationContext.getBean(SingletonBean.class);
//
//		PrototypeBean prototypeBean = ConfigurableApplicationContext.getBean(PrototypeBean.class);
//		PrototypeBean prototypeBean2 = ConfigurableApplicationContext.getBean(PrototypeBean.class);
//		PrototypeBean prototypeBean3 = ConfigurableApplicationContext.getBean(PrototypeBean.class);
////		PizzaController pizzaController = ConfigurableApplicationContext.getBean(PizzaController.class);
////		System.out.println(pizzaController.getPizza());
//
//		PizzaController pizzaController = ConfigurableApplicationContext.getBean("pizzaController",PizzaController.class);
//		System.out.println(pizzaController.getPizza());
//		MyController myController = ConfigurableApplicationContext.getBean(MyController.class);
//		System.out.println(myController.hello());

//		MyService myService = ConfigurableApplicationContext.getBean(MyService.class);
//		System.out.println(myService.sayHello());
//		MyRepository myRepository = ConfigurableApplicationContext.getBean(MyRepository.class);
//		System.out.println(myRepository.hello());
//
//		LazyLoader lazyLoader = ConfigurableApplicationContext.getBean(LazyLoader.class);


	}

}
