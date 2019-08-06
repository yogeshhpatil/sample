package com.sample.app.problemSolving;

public class PerfectSqrtCount {
    /**
     * Take input 2 integers and find count of perfect square in between them
     */

    // Solution 1
    private static boolean isPerfectSquare(double x) {
        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }

    public static int getCountSoln1(Integer noMin, Integer noMax) {
        int finalCount = 0;

        for (int i = noMin; i <= noMax; i++) {
            int count = 0;
            if (isPerfectSquare(i)) {
                count++;
                double sqrt = Math.sqrt(i);
                while (true) {
                    if (isPerfectSquare(sqrt)) {
                        count++;
                        sqrt = Math.sqrt(sqrt);
                    } else
                        break;
                }
            }

            if (count > finalCount)
                finalCount = count;
        }
        return finalCount;
    }

    // Solution 2
    private static int getCountSoln2(int minNo, int maxNo) {
        int count = 0;
        int sqrt = 0;

        for (int i = minNo; i <= maxNo; i++) {
            sqrt = (int) Math.sqrt(i);
            if ((sqrt * sqrt) == i) {
                while ((sqrt - Math.floor(sqrt)) == 0) {
                    count++;
                    sqrt = (int) Math.sqrt(sqrt);
                    if (sqrt == 1) {
                        break;
                    }
                }
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int minNo = 1000;
        int maxNo = 7000;

        System.out.println("Solution 1 count :: " + getCountSoln1(minNo, maxNo));
        System.out.println("Solution 2 count :: " + getCountSoln2(minNo, maxNo));
    }
}


