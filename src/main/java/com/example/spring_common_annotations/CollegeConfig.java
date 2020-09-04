package com.example.spring_common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration                                                                  // this is a configuration class, just like the beans.xml file
//@ComponentScan(basePackages = "com.example.spring_common_annotations")        // only need if using @Component, not @Bean
public class CollegeConfig
{
    @Bean(name = "mathTeacherBean")
    public MathTeacher mathTeacherBean()
    {
        System.out.println("returning math teacher");
        return new MathTeacher();
    }



    @Bean(name = "principalBean")
    public Principal principalBean()
    {
        System.out.println("returning principalBean");
        return new Principal();
    }


    @Bean(name = {"colBean", "anotherCollegeBean", "collegeBean"})             // can also give beanID name
    public College collegeBean()                                               // method name is the beanID by default
    {
        System.out.println("returning collegeBean");

        // return new College(principalBean());              // constructor injection

        College college = new College();                     // setter injection
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;
    }

}
