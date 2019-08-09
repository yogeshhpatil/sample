package com.sample.app.problemSolving;

import java.util.Arrays;
import java.util.Comparator;

public class TransformArray {
    /**
     * transform input array into output array.
     * input =  2, 4, 8, 5, 12, 15, 6, 10, 7, 30, 25, 43, 46, 45, 21
     * output = 2, 4, 8, 12, 6, 7, 43, 46, 21, 5, 15, 10, 30, 25, 45
     * <p>
     * do not use duplicate or extra array.
     * hint - all multiple of 5 moved to last.
     */

    public static void main(String[] args) {
        Integer input[] = {2, 4, 8, 5, 12, 15, 6, 10, 7, 30, 25, 43, 46, 45, 21};

        System.out.println("input : ");
        for (int b : input) {
            System.out.print(b + " ");
        }

        Arrays.sort(input, new Comparator<Integer>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                if (e1 % 5 == 0)
                    return 1;
                if (e2 % 5 == 0)
                    return -1;
                return 0;
            }
        });

        System.out.println("\noutput : ");

        for (int b : input) {
            System.out.print(b + " ");
        }
    }
}