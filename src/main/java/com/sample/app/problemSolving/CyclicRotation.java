package com.sample.app.problemSolving;

public class CyclicRotation {
    /**
     * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
     * and the last element of the array is moved to the first place.
     * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
     * (elements are shifted right by one index and 6 is moved to the first place).
     * <p>
     * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
     * <p>
     * Write a function:
     * <p>
     * class Solution { public int[] solution(int[] A, int K); }
     * <p>
     * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
     * <p>
     * For example, given
     * <p>
     * A = [3, 8, 9, 7, 6]
     * K = 3
     * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
     * <p>
     * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
     * [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
     * [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
     * For another example, given
     * <p>
     * A = [0, 0, 0]
     * K = 1
     * the function should return [0, 0, 0]
     * <p>
     * Given
     * <p>
     * A = [1, 2, 3, 4]
     * K = 4
     * the function should return [1, 2, 3, 4]
     * <p>
     * Assume that:
     * <p>
     * N and K are integers within the range [0..100];
     * each element of array A is an integer within the range [−1,000..1,000].
     */

    public static int[] solution(int[] a, int k) {
        for (int j = 0; j < k; j++) {
            for (int i = a.length - 1; i > 0; i--) {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.print("input  : ");
        for (int element : a) {
            System.out.print(element + " ");
        }

        int[] rotate = solution(a, 2);
        System.out.print("\noutput : ");
        for (int element : rotate) {
            System.out.print(element + " ");
        }
    }

}