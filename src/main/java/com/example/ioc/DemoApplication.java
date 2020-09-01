package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);

//		Vodaphone vodaphone = new Vodaphone();
//		vodaphone.calling();
//		vodaphone.data();
//
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();


		// program using interface
		// Polymorphism

		Sim sim = new Vodaphone();
		sim.calling();
		sim.data();


	}

}
