package org.example;

public class Main {
    //2. How do you swap two numbers without using a third variable in Java?
    public static void main(String[] args) {
       int a = 50;
       int b = 30;
       // We want a = 20, b = 10
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("%d %d %n",a, b);
    }
}