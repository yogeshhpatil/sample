package com.sample.app.problemSolving;

import java.util.Arrays;

public class Merge2ArraySorted {
    public static int[] merge(int[] input1, int[] input2) {
        Arrays.sort(input1);
        Arrays.sort(input2);

        int[] output = new int[input1.length + input2.length];

        int indexInput1 = 0, indexInput2 = 0, indexOutput = 0;

        while (indexInput1 < input1.length && indexInput2 < input2.length) {
            if (input1[indexInput1] < input2[indexInput2])
                output[indexOutput++] = input1[indexInput1++];
            else
                output[indexOutput++] = input2[indexInput2++];
        }

        while (indexInput1 < input1.length)
            output[indexOutput++] = input1[indexInput1++];

        while (indexInput2 < input2.length)
            output[indexOutput++] = input2[indexInput2++];

        return output;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 15, 4, 17, 6};
        int[] input2 = {2, -1, 11, 20};

        int[] output = merge(input1, input2);
        System.out.print("Output :: ");
        for (int a : output) {
            System.out.print(a + " ");
        }
    }
}
