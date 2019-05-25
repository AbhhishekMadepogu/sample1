package com.abhishek;

public class Example {
    public static void main(String[] args) {
        int x[] = new int[5];
        int y[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        x[0] = 100;
        x[1] = 200;
        x[2] = 300;
        x[3] = 400;
        x[4] = 500;

        Example day = new Example();

        day.handlestring();

    }
    public void handlestring()
    {
        String s1="hello world";
        System.out.println(s1);
        s1=s1.concat(" testing");
        System.out.println(s1);
        System.out.println(s1.charAt(3));
        System.out.println(s1.endsWith("ing"));
        System.out.println(s1.toUpperCase());
    }
}