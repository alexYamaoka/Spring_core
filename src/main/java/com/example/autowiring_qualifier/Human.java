package com.example.autowiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human
{
    private Heart heart;

    public Human()
    {

    }

    // autowired tries byType first and if it fails, does byName

    //@Autowired
    public Human(Heart heart)
    {
        this.heart = heart;
        System.out.println("Human constructor called");
    }

    @Autowired
    @Qualifier("humanHeart")
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
