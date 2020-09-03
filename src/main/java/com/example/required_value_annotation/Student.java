package com.example.required_value_annotation;

public class Student
{
    private String name;
    private String interestedCourse;
    private String hobby;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setInterestedCourse(String interestedCourse)
    {
        this.interestedCourse = interestedCourse;
    }

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
