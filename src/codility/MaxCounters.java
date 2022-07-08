package codility;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 1, 2, 3, 4};
        int[] solution = solution(3, ints);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int n, int[] a) {
        int[] result = new int[n];
        int max = 0;
        for (int i : a) {
            if (i == n + 1) {
                Arrays.fill(result, max);
            } else {
                result[i - 1]++;
                max = Math.max(max, result[i - 1]);
            }
        }
        return result;
    }
}
