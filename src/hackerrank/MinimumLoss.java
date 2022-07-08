package hackerrank;

import java.util.*;

public class MinimumLoss {

    public static void main(String[] args) {
        System.out.println(minimumLoss(List.of(20L, 7L, 8L, 2L, 5L)));
    }

    public static int minimumLoss3(List<Long> price) {
        // Write your code here
        var min = Long.MAX_VALUE;
        for (int i = 0; i < price.size(); i++) {
            for (int j = i + 1; j < price.size(); j++) {
                if (price.get(i) > price.get(j)) {
                    min = Math.min(price.get(i) - price.get(j), min);
                }
            }
        }
        return (int) min;
    }

    //theoretically this solution is more efficient
   public static int minimumLoss(List<Long> price) {

        var list = new ArrayList<>(price);
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }

        Collections.sort(list);
        long minimum = Long.MAX_VALUE;
        for (int i = list.size() - 1; i > 0; i--) {
            if (map.get(list.get(i)) < map.get(list.get(i - 1))) {
                minimum = Math.min(list.get(i) - list.get(i - 1), minimum);
            }
        }

        return (int) minimum;

    }
}
