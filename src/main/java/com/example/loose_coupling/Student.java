package com.example.loose_coupling;

public class Student
{
    private MathCheat mathCheat;

    public void setMathCheat(MathCheat mathCheat)
    {
        this.mathCheat = mathCheat;
    }

    public void cheating()
    {
        mathCheat.mathCheat();
    }
}
