package codility;

import java.util.*;
import java.util.stream.Collectors;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int solution = solution2(new int[]{-3, 1, 2, -2, 5, 6});
        System.out.println(solution);
    }

    //    For example, array A such that:
//    A[0] = -3
//    A[1] = 1
//    A[2] = 2
//    A[3] = -2
//    A[4] = 5
//    A[5] = 6
//    contains the following example triplets:
//
//            (0, 1, 2), product is −3 * 1 * 2 = −6
//            (1, 2, 4), product is 1 * 2 * 5 = 10
//            (2, 4, 5), product is 2 * 5 * 6 = 60 ==> This is a result because it is the highest score
//    Your goal is to find the maximal product of any trip
//
    public static int solution(int[] A) {
        Set<Triple> tripleSet = new HashSet<>();
        List<Integer> integers = Arrays.stream(A).boxed().collect(Collectors.toList());
        for (int i = 0; i < integers.size(); i++)
            for (int j = i + 1; j < integers.size(); j++)
                for (int k = j + 1; k < integers.size(); k++)
                    if (i != j && j != k && k != i)
                        tripleSet.add(new Triple(integers.get(i), integers.get(j), integers.get(k)));

        return tripleSet.stream().mapToInt(triple -> triple.getA() * triple.getB() * triple.getC())
                .max().orElseThrow(NoSuchElementException::new);
    }

    public static int solution2(int[] A) {
        // max_1 = positive * positive * positive
        // max_2 = negative * negative * positive
        // max = Math.max(max_1, max_2)
        // just need to sort the integer array
        Arrays.sort(A);
        int max_1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int max_2 = A[0] * A[1] * A[A.length - 1];
        return Math.max(max_1, max_2);
    }


    public static class Triple {
        final Integer a;
        final Integer b;
        final Integer c;

        public Triple(Integer a, Integer b, Integer c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public Integer getA() {
            return a;
        }

        public Integer getB() {
            return b;
        }

        public Integer getC() {
            return c;
        }
    }
}

