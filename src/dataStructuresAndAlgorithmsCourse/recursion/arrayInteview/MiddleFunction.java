package dataStructuresAndAlgorithmsCourse.recursion.arrayInteview;

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5}; //2,3
        System.out.println(Arrays.toString(middle2(arr)));
    }


    public static int[] middle(int[] arr) {
        int[] a;
        if (arr.length % 2 == 0) {
            a = new int[2];
            a[0] = arr[arr.length / 2 - 1];
            a[1] = arr[arr.length / 2];
        } else {
            a = new int[1];
            a[0] = arr[arr.length / 2];
        }
        return a;
    }

    public static int[] middle2(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }
}
