package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        int i = divisibleSumPairs(5, 3, List.of(1, 3, 2, 6, 1, 2));
        System.out.println(i);
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        n = ar.size();
        var pair = new ArrayList<Pair>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                var sum = ar.get(i) + ar.get(j);
                if (sum % k == 0) {
                    pair.add(new Pair(ar.get(i), ar.get(j)));
                }
            }
        }
        return pair.size();
    }

    public static class Pair {
        Integer a;
        Integer b;

        public Pair(Integer a, Integer b) {
            this.a = a;
            this.b = b;
        }

    }


}
