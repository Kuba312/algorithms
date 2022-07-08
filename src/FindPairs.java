import java.util.*;

public class FindPairs {


    public static void main(String[] args) {

        findPairs(Arrays.asList(2, 3, 4, 4, 6), 8);
    }

    public static void findPairs(List<Integer> integers, Integer sum) {
        Set<Pair> pairs = new HashSet<>();
        for (int i = 0; i < integers.size() - 1; i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if ((integers.get(i) + integers.get(j)) == sum) {
                    pairs.add(new Pair(integers.get(i), integers.get(j)));
                }
            }
        }
        System.out.println(pairs);
    }

    public static class Pair {
        Integer a;
        Integer b;

        public Pair(Integer a, Integer b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
}


