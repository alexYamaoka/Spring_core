package com.example.autowiring_qualifier;

public class Heart
{
    private String nameOfAnimal;
    private int numberOfHearts;

    public void setNameOfAnimal(String nameOfAnimal)
    {
        this.nameOfAnimal = nameOfAnimal;
    }

    public void setNumberOfHearts(int numberOfHearts)
    {
        this.numberOfHearts = numberOfHearts;
    }

    public String getNameOfAnimal()
    {
        return nameOfAnimal;
    }

    public int getNumberOfHearts()
    {
        return numberOfHearts;
    }

    public void pump()
    {
        System.out.println("your heart is pumping");
        System.out.println("alive");
        System.out.println("Name of animal: " + nameOfAnimal);
        System.out.println("Number of hearts: " + numberOfHearts);
    }
}
