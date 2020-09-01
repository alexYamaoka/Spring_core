package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);


		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config file loaded");

//		Airtel airtel =  (Airtel) applicationContext.getBean("airtel");
//		airtel.calling();
//		airtel.data();

//		Airtel airtel = applicationContext.getBean("airtel", Airtel.class);
//		airtel.calling();
//		airtel.data();

		Sim sim = applicationContext.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}

}
