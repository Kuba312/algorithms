package codility;

import java.util.HashSet;
import java.util.Set;

public class PassingCars {
    public static void main(String[] args) {
        int solution = solution2(new int[]{0, 1, 0, 1, 1});
        System.out.println(solution);
    }

    public static int solution(int[] A) {
        Set<Pair> pairs = new HashSet<>();
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == 0 && A[j] == 1) pairs.add(new Pair(i, j));
                else if (pairs.size() > 1000000000) return -1;
            }
        }
        return pairs.size();
    }

    public static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    //more efficient solution
    public static int solution2(int[] A) {
        int countOne = 0;
        int countZero = 0;
        int pair = 0;
        int counter = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            counter++;
            if (A[i] == 1) countOne++;
             else if (A[i] == 0) {
                countZero++;
                pair += counter - countZero;
                if (pair > 1000000000) {
                    return -1;
                }
            }
        }
        return pair;
    }

}
