package codility;


import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;

//For example, consider integer M = 6 and array A such that:
//
//        A[0] = 3
//        A[1] = 4
//        A[2] = 5
//        A[3] = 5
//        A[4] = 2
//        There are exactly nine
//        distinct slices: (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2), (3, 3), (3, 4) and (4, 4).
//                          3, 3    3, 4    3, 5    4, 4    4, 5    5, 5    5, 5    5, 2       2, 2
//                                                    x
//        The goal is to calculate the number of distinct slices.
public class CountDistinctSlices {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{3, 4, 5, 5, 2}));
    }

    public static int solution(int M, int[] A) {
        boolean[] seen = new boolean[M + 1]; // from 0 to M
        // Arrays.fill(seen, false); // note: "false" by default
        int leftEnd = 0;
        int rightEnd = 0;
        int numSlice = 0;
        // key point: move the "leftEnd" and "rightEnd" of a slice
        while (leftEnd < A.length && rightEnd < A.length) {
            // case 1: distinct (rightEnd)
            if (!seen[A[rightEnd]]) {
                // note: not just +1
                // there could be (rightEnd - leftEnd + 1) combinations (be careful)
                numSlice = numSlice + (rightEnd - leftEnd + 1);
                if (numSlice >= 1_000_000_000)
                    return 1_000_000_000;

                // increase the slice to right by "1" (important)
                seen[A[rightEnd]] = true;
                rightEnd++;
            }
            // case 2: not distinct
            else {
                // decrease the slice from left by "1" (important)
                // remove A[leftEnd] from "seen" (be careful)
                seen[A[leftEnd]] = false;
                leftEnd++;
            }
        }

        return numSlice;
    }


}

