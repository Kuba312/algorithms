package codility;


// the profit of such transaction is equal to A[Q] − A[P],
// provided that A[Q] ≥ A[P]. Otherwise, the transaction brings loss of A[P] − A[Q].
// For example, consider the following array A consisting of six elements such that:
//  A[0] = 23171
//  A[1] = 21011
//  A[2] = 21123
//  A[3] = 21366
//  A[4] = 21013
//  A[5] = 21367
//If a share was bought on day 0 and sold on day 2, a loss of 2048 would occur
// because A[2] − A[0] = 21123 − 23171 = −2048. If a share was bought on day 4 and sold on day 5,
// a profit of 354 would occur because A[5] − A[4] = 21367 − 21013 = 354. Maximum possible profit was 356.
// It would occur if a share was bought on day 1 and sold on day 5.
// the function should return 356, as explained above
public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

    //66%
    public static int solution(int[] A) {
        var maxValue = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                var result = Math.max(0, A[j] - A[i]);
                if (result > maxValue) maxValue = result;
            }
        }
        return maxValue;
    }

    //more efficient solution - 100%
    public static int solution2(int[] A) {
        if (A.length < 2) return 0;
        var buy = A[0];
        var profit = 0;
        for (int i = 1; i < A.length; ++i) {
            final var value = A[i];
            profit = Math.max(profit, value - buy);
            buy = Math.min(buy, value);
        }
        return profit;
    }
}
