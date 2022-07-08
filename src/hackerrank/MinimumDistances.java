package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumDistances {
    public static void main(String[] args) {
        int i = minimumDistances(List.of(1, 2, 3, 4, 10));
        System.out.println(i);
    }

    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        var duplicates = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    duplicates.add(Math.abs(i - j));
                }
            }
        }
        return duplicates.size() == 0 ? -1 : Collections.min(duplicates);
    }
}
