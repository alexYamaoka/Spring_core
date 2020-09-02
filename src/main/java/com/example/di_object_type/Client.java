package com.example.di_object_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Student student = applicationContext.getBean("cheatingStudent", Student.class);
        student.cheating();
    }
}
