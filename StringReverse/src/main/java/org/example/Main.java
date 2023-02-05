package org.example;

public class Main {
    //1. How do you reverse a string in Java
    public static void main(String[] args) {
        System.out.println(reverseString("Hello world!"));
    }

    public static String reverseString(String stringToReverse){
        if(stringToReverse == null)
            throw new IllegalArgumentException("Not a valid input");

        StringBuilder output = new StringBuilder();
        char[] chars = stringToReverse.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--){
            output.append(chars[i]);
        }
        return output.toString();
    }
}