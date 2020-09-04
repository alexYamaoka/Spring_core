package com.example.spring_common_annotations;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mathTeacherBean")
// @Primary         // if there's more than 1 bean of the same type, this gets priority. don't have to use Qualifier
public class MathTeacher implements Teacher
{
    @Override
    public void teach()
    {
        System.out.println("Hi I am your math teacher");
        System.out.println("My name is Joe Kelly");
    }
}
