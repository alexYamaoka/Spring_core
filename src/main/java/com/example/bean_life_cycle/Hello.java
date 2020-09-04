package com.example.bean_life_cycle;

public class Hello
{
    public void init()
    {
        System.out.println("inside Hello class init method");
    }

    public void destroy()
    {
        System.out.println("inside Hello class destroy method");
    }
}
