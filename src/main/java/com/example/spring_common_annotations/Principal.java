package com.example.spring_common_annotations;


import org.springframework.stereotype.Component;

@Component("principalBean")
public class Principal
{
    public void principalInfo()
    {
        System.out.println("Hi I am your principal");
        System.out.println("My name is James Bond");
    }
}
