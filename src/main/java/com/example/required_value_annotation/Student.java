package com.example.required_value_annotation;

import org.springframework.beans.factory.annotation.Value;

public class Student
{
    private String name;
    private String interestedCourse;
    private String hobby;


    //@Value("Kevin")         // to inject values statically
    @Value("${student.name}")
    public void setName(String name)
    {
        this.name = name;
    }


    //@Required - deprecated... use autowired for constructor injection
    //@Value("Biology")
    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse)
    {
        this.interestedCourse = interestedCourse;
    }

    //@Value("Soccer")
    @Value("${student.hobby}")
    public void setHobby(String hobby)
    {
        this.hobby = hobby;
    }

    public String getName()
    {
        return name;
    }

    public String getInterestedCourse()
    {
        return interestedCourse;
    }

    public String getHobby()
    {
        return hobby;
    }

    public void displayStudentInfo()
    {
        System.out.println("Student's name: " + name);
        System.out.println("Student's interested course: " + interestedCourse);
        System.out.println("Student's hobby: " + hobby);
    }
}
