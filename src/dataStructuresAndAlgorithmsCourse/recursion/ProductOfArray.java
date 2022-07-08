package dataStructuresAndAlgorithmsCourse.recursion;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(productOfArray(ints, ints.length));
    }

    //Iteration
    public static int productOfArray(int[] A, int N) {
        return Arrays.stream(A, 0, N).reduce(1, (a, b) -> a * b);
    }

    //Recursion
    public int productOfArray2(int[] A, int N) {
        if (N <= 0) return 1;
        return (productOfArray2(A, N - 1) * A[N - 1]);
    }
}
