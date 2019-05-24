package com.abhishek;

public class Example
{
    public static void main (String [] args)
    {
        int x[]=new int[5];
        int y[]={10,20,30,40,50,60,70,80,90,100};
        x[0]=100;
        x[1]=200;
        x[2]=300;
        x[3]=400;
        x[4]=500;

        Example main = new Example();
        int s = main.sumofarray(x);
        System.out.println(s);
        for(int i=0;i<x.length;i++)
        {
            System.out.println("X[]" + x[i]);
        }

    }
    public int sumofarray(int a[])
    {
        int sum=0;
        for(int x: a)
        {
         sum = sum + x;
        }
        return(sum);
    }
}
