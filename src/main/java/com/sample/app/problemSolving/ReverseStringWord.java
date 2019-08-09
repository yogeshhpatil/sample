package com.sample.app.problemSolving;

public class ReverseStringWord {
    /**
     * Reverse string each word in string without using library function like split.
     * input - "I love my india"
     * output - "india my love i"
     */

    public static String reverseString(String input) {
        String output = "";
        String word = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                output = word + " " + output;
                word = "";
            } else {
                word += input.charAt(i);
            }

            if (i == input.length() - 1) {
                output = word + " " + output;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("I love my india"));
    }
}