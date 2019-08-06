package com.sample.app.problemSolving;

public class RevStringPreservingSpacePositions {
    public static void main(String[] args) {
        System.out.println(reverseString("i am happy"));
    }

    public static String reverseString(String str) {
        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != ' ') {

                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        return String.valueOf(result);
    }
}