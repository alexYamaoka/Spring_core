package com.example.dependencyInjection;

public class Student
{
    private int id;
    private String studentName;

    public Student()
    {
        System.out.println("student default constructor");
    }

    public Student(int id, String studentName)
    {
        System.out.println("student constructor called");
        this.id = id;
        this.studentName = studentName;
    }

    public void setId(int id)
    {
        System.out.println("setId method called");
        this.id = id;
    }

    public void setStudentName(String studentName)
    {
        System.out.println("setStudentName called");
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
