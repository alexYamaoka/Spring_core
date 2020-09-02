package com.example.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");


        Student student = applicationContext.getBean("alex", Student.class);
        student.displayStudentInfo();


        student = applicationContext.getBean("kevin", Student.class);
        student.displayStudentInfo();


        student = applicationContext.getBean("student", Student.class);
        student.displayStudentInfo();
    }
}
