package codility;


// that, given an array A consisting of N integers, returns the maximum sum of any slice of A.
//
//        For example, given array A such that:
//
//        A[0] = 3  A[1] = 2  A[2] = -6
//        A[3] = 4  A[4] = 0
//        the function should return 5 because:
//
//        (3, 4) is a slice of A that has sum 4,
//        (2, 2) is a slice of A that has sum −6,
//        (0, 1) is a slice of A that has sum 5,
//        no other slice of A has sum greater than (0, 1).
public class MaxSliceSum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 2, -6, 4, 0}));
    }

    public static int solution(int[] A) {
        // initial setting A[0]
        int maxEndingPrevious = A[0];
        int maxEndingHere = A[0];
        int maxSoFar = A[0];

        // note: for i=0, it will return A[0] (also for "one element" cases)

        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]); // <--- key point~!!
            maxEndingPrevious = maxEndingHere;
            maxSoFar = Math.max(maxSoFar, maxEndingHere); // update the max (be careful)
        }
        return maxSoFar;
    }

}
