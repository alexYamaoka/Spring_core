package com.example.dependencyInjection;

public class Student
{
    private int id;
    private String studentName;


    public void setId(int id)
    {
        System.out.println("Inside setId method");
        this.id = id;
    }

    public void setStudentName(String studentName)
    {
        System.out.println("Inside setStudentName method");
        this.studentName = studentName;
    }

    public void displayStudentInfo()
    {
        System.out.println();
        System.out.println("Displaying student info: ");
        System.out.println("Student id is: " + id);
        System.out.println("Student name is: " + studentName);
    }
}
