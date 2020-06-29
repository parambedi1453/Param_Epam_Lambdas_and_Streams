package org.example;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Ques1 {
    public static void main(String args[])
    {
        IntStream stream=IntStream.of(10,10,30,40,50,60,70,80,90);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println("Stream average is : "+obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}