package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        System.out.println(solution2(new int[]{1, 5, 2, 1, 4, 0}));
    }

//  A[0] = 1
//  A[1] = 5
//  A[2] = 2
//  A[3] = 1
//  A[4] = 4
//  A[5] = 0
// For input like above function should return 11 because disks intersect 11 times
    public static int solution(int[] A) {
        int[] starts = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int radius = A[i];
            int starPos = i - radius;
            if (starPos < 0) starPos = 0;
            starts[starPos]++;
        }
        int total = 0;
        for (int i = 0; i < starts.length; i++) {
            total += starts[i];
            starts[i] = total;
        }
        int totalIntersections = 0;
        for (int i = 0; i < A.length; i++) {
            int radius = A[i];
            int endPos = i + radius;
            if (endPos > A.length - 1) endPos = A.length - 1;
            int interactions = Math.max(starts[i], starts[endPos]) - (i + 1);
            totalIntersections += interactions;
            if (totalIntersections > 10000000) return -1;
        }
        return totalIntersections;
    }

    public static int solution2(int[] A) {
        // main idea:
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point > one lower point)

        // note: use "long" for big numbers (be careful)
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            lower[i] = i - (long) A[i]; // note: lower = center - A[i]
            upper[i] = i + (long) A[i]; // note: upper = center + A[i]
        }

        // "sort" the "lower points" and "upper points"
        Arrays.sort(upper);
        Arrays.sort(lower);

        int intersection = 0; // number of intersections
        int j = 0; // for the lower points

        // scan the upper points
        for (int i = 0; i < A.length; i++) {
            // for the current "j" (lower point)
            while (j < A.length && upper[i] >= lower[j]) {
                intersection += j; // add j intersections
                intersection -= i; // minus "i" (avoid double count)
                j++;
            }
        }
        // for the overflow cases
        if (intersection > 10_000_000)
            return -1;

        return intersection; // number of intersections
    }
}
