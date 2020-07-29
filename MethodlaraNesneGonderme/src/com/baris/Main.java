package com.baris;

import static java.lang.Integer.sum;

public class Main
{

    public static void main(String[] args)
    {
        int a=15;
        int b=20;
        int sum=sum(a,b);

        System.out.println(sum);
        System.out.println(add(a,b));
    }

    private static double add(int a, int b)
    {

        return (a+10)+(b+5);
    }
}
