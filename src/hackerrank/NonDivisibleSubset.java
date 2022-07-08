package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3, List.of(1, 7, 2, 4)));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        var result = new HashSet<Integer>();
        for (int i = 0; i < s.size(); i++) {
            for (int j = i + 1; j < s.size(); j++) {
                var sum = s.get(i) + s.get(j);
                if (sum % k != 0) {
                    result.add(s.get(i));
                    result.add(s.get(j));
                }
            }
        }
        return result.size();
    }
}
