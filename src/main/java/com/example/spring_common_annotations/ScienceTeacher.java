package com.example.spring_common_annotations;


import org.springframework.stereotype.Component;

@Component("scienceTeacherBean")
public class ScienceTeacher implements Teacher
{
    @Override
    public void teach()
    {
        System.out.println("Hi I am your science teacher");
        System.out.println("My name is Bryce Harper");
    }
}
