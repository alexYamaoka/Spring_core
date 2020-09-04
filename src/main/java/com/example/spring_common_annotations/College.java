package com.example.spring_common_annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;




//@Component("collegeBean")               // creates object, bean as in xml file. "collegeBean" is the beanID
public class College
{
    private Principal principal;

    public College(Principal principal)
    {
        this.principal = principal;
    }

    public void setPrincipal(Principal principal)
    {
        this.principal = principal;
    }

    public void test()
    {
        System.out.println("testing this class method");
        principal.principalInfo();
    }
}
