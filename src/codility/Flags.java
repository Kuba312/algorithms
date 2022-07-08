package codility;


import java.util.ArrayList;

// A peak is an array element which is larger than its neighbours.
// More precisely, it is an index P such that 0 < P < N − 1 and A[P − 1] < A[P] > A[P + 1].
//
//        For example, the following array A:
//
//        A[0] = 1
//        A[1] = 5  ==> cause between 5 is 1 and 3  ==> 1 < 5 > 3 ==> A[P − 1] < A[P] > A[P + 1]
//        A[2] = 3
//        A[3] = 4  ==> cause between 4 is 3 and 3 ==> 3 < 4 > 3 ==> A[P − 1] < A[P] > A[P + 1]
//        A[4] = 3
//        A[5] = 4
//        A[6] = 1
//        A[7] = 2
//        A[8] = 3
//        A[9] = 4
//        A[10] = 6
//        A[11] = 2
//        has exactly four peaks: elements 1, 3, 5 and 10.
//  Flags can only be set on peaks. What's more, if you take K flags,
// then the distance between any two flags should be greater than or equal to K.
// The distance between indices P and Q is the absolute value |P − Q|.
//
//  For example, given the mountain range represented by array A, above, with N = 12, if you take:
//
//  two flags, you can set them on peaks 1 and 5;
//  three flags, you can set them on peaks 1, 5 and 10;
//  four flags, you can set only three flags, on peaks 1, 5 and 10.
public class Flags {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }

    //    A[P − 1] < A[P] > A[P + 1]
    public static int solution(int[] A) {
        var count = 0;
        var peaks = 0;
        var flags = 0;
        var list = new ArrayList<Integer>();
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1] && list.isEmpty()) {
                list.add(i);
            } else {
                Integer lastIndexOfFlag = list.get(list.size() - 1);
            }
        }
        return peaks;
    }
}
