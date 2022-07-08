package hackerrank;

import java.util.*;

public class SubarrayDivision {

    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 4), 4, 1));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        HashSet<List<Integer>> lists = new HashSet<>();
        for (int i = 0; i < s.size(); i++) {
            for (int j = i + 1; j < s.size(); j++) {
                if (s.get(i) + s.get(j) == d) {
                    Integer[] integers = new Integer[]{s.get(i), s.get(j)};
                    m = integers.length;
                    List<Integer> list = Arrays.asList(integers);
                    lists.add(list);
                } else if ((s.get(i) == d || s.get(j) == d) && m == 1) {
                    return 1;
                }
            }
        }
        return lists.size();
    }

    public static int birthday2(List<Integer> s, int d, int m) {
        int sum = 0, ways = 0;
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        for (int i = 0; i < s.size() - m + 1; i++) {
            if (sum == d) {
                ways++;
            }
            if (i + m < s.size()) {
                sum = sum - s.get(i) + s.get(i + m);
            }
        }
        return ways;
    }
}
