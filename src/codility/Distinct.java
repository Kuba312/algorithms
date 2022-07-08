package codility;

import java.util.HashSet;
import java.util.Set;

// A[0] = 2    A[1] = 1    A[2] = 1
// A[3] = 2    A[4] = 3    A[5] = 1
public class Distinct {
    public static void main(String[] args) {
        int solution = solution(new int[]{2, 2, 1, 1, 1, 3});
        System.out.println(solution);
    }

    public static int solution(int[] A) {
        Set<Integer> numbersWithoutDuplicate = new HashSet<>();
        for (int j : A) {
            numbersWithoutDuplicate.add(j);
        }
        return numbersWithoutDuplicate.size();
    }
}
