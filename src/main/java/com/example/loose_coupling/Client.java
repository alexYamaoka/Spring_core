package com.example.loose_coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");

        Student student = applicationContext.getBean("student", Student.class);
        student.cheating();
    }
}
