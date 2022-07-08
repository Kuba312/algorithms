package codility;

// leader of this array is the value that occurs in more than half of the elements of A.
// For example, given array A such that:
//
//        A[0] = 4
//        A[1] = 3
//        A[2] = 4
//        A[3] = 4
//        A[4] = 4
//        A[5] = 2
//        we can find two equi leaders:
//
//        0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
//        2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.

import java.util.Arrays;
import java.util.HashMap;

public class EquiLeader {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 4, 4, 4, 2}));
    }


    private static int dominator;
    private static int dominatorCount;

    public static int solution(int[] A) {
        var counters = new HashMap<Integer, Integer>();
        for (int a : A) {
            counters.put(a, counters.getOrDefault(a, 0) + 1);
            if (counters.get(a) > A.length / 2) {
                dominator = a;
                dominatorCount = counters.get(a);
            }
        }
        var equiLeader = 0;
        var leadersInRightSide = dominatorCount;
        var countRightSide = A.length;
        var countLeftSide = 0;
        var leadersInLeftSide = 0;
        for (int i : A) {
            if (i == dominator) {
                leadersInRightSide--;
                leadersInLeftSide++;
            }
            countLeftSide++;
            countRightSide--;

            if (leadersInLeftSide > countLeftSide / 2) {
                if (leadersInRightSide > countRightSide / 2) {
                    equiLeader++;
                }
            }
        }
        return equiLeader;
    }
}
