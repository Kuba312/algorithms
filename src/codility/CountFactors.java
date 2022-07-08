package codility;


//  A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.
//
//  For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).
//
//  that, given a positive integer N, returns the number of its factors.
//  For example, given N = 24, the function should return 8, because 24 has 8 factors,
//  namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.
public class CountFactors {
    public static void main(String[] args) {
        System.out.println(solution(24));
    }

    public static int solution(int N) {
         int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) count++;
        }
        return count;
    }

    public static int solution2(int N) {
        if (N > 0) {
            int i = solution2(N - 1);
            if (i != 0 && N % i == 0) {
                System.out.println(i);
            }
        }
        return 0;
    }

}
