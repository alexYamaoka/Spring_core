package com.example.spring_common_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans5.xml");
        System.out.println("beans5.xml file loaded");

        College college = applicationContext.getBean("collegeBean", College.class);
    }
}
