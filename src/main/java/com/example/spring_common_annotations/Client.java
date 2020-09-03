package com.example.spring_common_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
        System.out.println("CollegeConfig class loaded");

        College college = applicationContext.getBean("collegeBean", College.class);
        college.test();
    }
}
