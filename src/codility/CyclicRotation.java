package codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        new CyclicRotation().solution(null, 0);
    }

    public int[] solution(int[] A, int K) {
        if (A.length == 0) return A;
        K = K % A.length;
        if (K == 0) return A;

        int[] ints = {1, 2, 3, 4, 5};
        int[] result = new int[A.length];

        System.arraycopy(A, A.length - K, result, 0, K);
        System.arraycopy(A, 0, result, K, A.length - K);
        System.out.println(Arrays.toString(result));

        return result;
    }

    public int[] solution2(int[] A, int K) {
        if (A.length == 0) return A;
        K = K % A.length;
        for (int i = 0; i < K; i++) {
            A = moveByOne(A);
        }
        return A;
    }

    private int[] moveByOne(int[] A) {
        int[] result = new int[A.length];
        result[0] = A[A.length - 1];
        for (int i = 0; i < A.length - 1; i++) {
            result[i + 1] = A[i];
        }
        return result;
    }
}

