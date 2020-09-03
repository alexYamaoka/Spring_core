package com.example.spring_common_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration                                  // this is a configuration class, just like the beans.xml file
//@ComponentScan(basePackages = "com.example.spring_common_annotations")        // only need if using @Component, not @Bean
public class CollegeConfig
{
    @Bean
    public College collegeBean()        // method name is the beanID
    {
        return new College();
    }

}
