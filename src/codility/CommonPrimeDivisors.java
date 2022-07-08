package codility;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//For example, given:
//
//        A[0] = 15   B[0] = 75
//        A[1] = 10   B[1] = 30
//        A[2] = 3    B[2] = 5
//        the function should return 1, because only one pair (15, 75) has the same set of prime divisors.
//For example, given:
//
//        N = 15 and M = 75, the prime divisors are the same: {3, 5};
//        N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
//        N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
public class CommonPrimeDivisors {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{15, 10, 9}, new int[]{75, 30, 5}));
    }

    public static int solution(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (hasAllPrimeFactors(A[i], B[i]) && hasAllPrimeFactors(B[i], A[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean hasAllPrimeFactors(int x, int y) {
        if (y == 1) {
            return true;
        }
        int gcd = getGcd(x, y);
        if (gcd == 1) {
            return false;
        }
        return hasAllPrimeFactors(x, y / gcd);
    }

    private static int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }

}
