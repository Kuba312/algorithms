package codility;

import java.util.*;

public class GenomicRangeQuery {
    public static void main(String[] args) {

        int[] gacts = solution("GACT", new int[]{1, 2}, new int[]{5, 3});
        System.out.println(Arrays.toString(gacts));
    }

//    For example, given the string S = G A C A C C A T A and arrays P, Q such that:
//                                      3 1 2 1 2 2 1 4 1
//                                      0 1 2 3 4 5 6 7 8
//  P[0] = 0    Q[0] = 8 ==> 1
//  P[1] = 0    Q[1] = 2 ==> 1
//  P[2] = 4    Q[2] = 5 ==> 2
//  P[3] = 7    Q[3] = 7 ==> 4
    public static int[] solution(String S, int[] P, int[] Q) {
        int[] C = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            C[i] = factor(S, P[i], Q[i]);
        }

        return C;
    }

    public static int factor(String S, int i, int j) {
        if (S.substring(i, j + 1).contains("A")) {
            return 1;
        } else if (S.substring(i, j + 1).contains("C")) {
            return 2;
        } else if (S.substring(i, j + 1).contains("G")) {
            return 3;
        }

        return 4;
    }
}
