package com.example.autowiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Human
{
    private Heart heart;

    public Human()
    {

    }

    @Autowired
    public Human(Heart heart)
    {
        this.heart = heart;
        System.out.println("Human constructor called");
    }

    public void setHeart(Heart heart)
    {
        this.heart = heart;
        System.out.println("setHeart method called");
    }

    public void startPumping()
    {
        if (heart != null)
        {
            heart.pump();
        }
        else
        {
            System.out.println("you are dead");
        }

    }
}
