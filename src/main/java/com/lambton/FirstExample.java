package com.lambton;

import java.util.Arrays;

public class FirstExample
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to JAVA Programming");

        for(int i = 1; i <= 10; i++)
            System.out.println("Pritesh Patel");

        //Day - 2 Code Starts here

        int a = 100;
        int b;

        b = 200;

        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Sum = " + (a + b));
        System.out.println(a + b + "Sum");

        short x = 32767;
        System.out.println("Short MAX = " + Short.MAX_VALUE);
        System.out.println("Short MIN = " + Short.MIN_VALUE);

        long y = 2147483647;
        System.out.println(y);


        float f1 = 1000.50F;
        double f2 = 1000.40D;
        System.out.println("F1 = " + f1);
        System.out.println("F2 = " + f2);

        int r1 = (int)(10.0f / 3);
        float r3 = (float)10 / 3;
        float r2 = 10.0f / 3;

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);

        double x1 = 1_00____00.5_0;
        System.out.println("X1 = " + x1);



    }
}
