package com.example.spring_common_annotations;


import org.springframework.stereotype.Component;

@Component("mathTeacherBean")
public class MathTeacher implements Teacher
{
    @Override
    public void teach()
    {
        System.out.println("Hi I am your math teacher");
        System.out.println("My name is Joe Kelly");
    }
}
