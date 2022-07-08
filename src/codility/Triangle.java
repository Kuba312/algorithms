package codility;


import java.util.Arrays;

//An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
//
//        A[P] + A[Q] > A[R],
//        A[Q] + A[R] > A[P],
//        A[R] + A[P] > A[Q].
//        For example, consider array A such that:
//
//        A[0] = 10    A[1] = 2    A[2] = 5
//        A[3] = 1     A[4] = 8    A[5] = 20
//        Triplet (0, 2, 4) is triangular.
//A[0] = 10    A[1] = 50    A[2] = 5
//        A[3] = 1
public class Triangle {

    public static void main(String[] args) {
        int solution = solution(new int[]{10, 2, 5, 1});
        System.out.println(solution);
    }


    public static int solution(int[] A) {
        for (int P = 0; P < A.length - 1; P++)
            for (int Q = P + 1; Q < A.length; Q++)
                for (int R = Q + 1; R < A.length; R++)
                    if (P < Q && Q < R)
                        if (A[P] + A[Q] > A[R] && A[Q] + A[R] > A[P] && A[R] + A[P] > A[Q]) return 1;
        return 0;
    }

    public int solution2(int[] A) {
        Arrays.sort(A);
        if (A.length < 3) return 0;
        for (int i = 0; i < A.length - 2; i++)
            //Will cause overflow if all these three are MaxInteger. Change to A[i]>A[i+2]-A[i+1]
            if (A[i] + A[i + 1] > A[i + 2]) return 1;
        return 0;
    }
}
