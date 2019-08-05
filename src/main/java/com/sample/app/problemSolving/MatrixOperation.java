package com.sample.app.problemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperation {
    /**
     *
     *  Take input for n*n matrix
     *  find out horizontal , vertical addition.
     *  print them in given format.
     *  also print max of vertical and horizontal addition.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N for matrix : ");
        int n = scanner.nextInt();
        Integer matrix[][] = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matrix["+i+"]["+j+"] : ");
                matrix[i][j]=scanner.nextInt();
            }
        }

        Integer horizontalAdd[] = new Integer[n];
        Integer verticalAdd[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            Integer addHor=0;
            Integer addVer=0;
            for (int j = 0; j < n; j++) {
                addHor+=matrix[i][j];
                addVer+=matrix[j][i];
            }
            horizontalAdd[i]=addHor;
            verticalAdd[i]=addVer;
        }

        System.out.println("\nMatrix");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print(horizontalAdd[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(verticalAdd[i]+"\t");
        }

        Arrays.sort(verticalAdd);
        Arrays.sort(horizontalAdd);

        System.out.println("\nGreater vertical   : "+verticalAdd[n-1]);
        System.out.println("Greater horizontal : "+horizontalAdd[n-1]);
    }
}
