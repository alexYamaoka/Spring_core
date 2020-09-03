package com.example.autowiring_qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans3.xml");
        Human human = applicationContext.getBean("human", Human.class);
        human.startPumping();
    }
}
