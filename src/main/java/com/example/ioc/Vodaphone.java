package com.example.ioc;

public class Vodaphone implements Sim
{
    @Override
    public void calling()
    {
        System.out.println("Calling using Vodaphone Mobile");
    }

    @Override
    public void data()
    {
        System.out.println("Browsing internet using Vodaphone Sim");
    }
}
