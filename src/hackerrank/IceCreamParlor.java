package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {

        System.out.println(icecreamParlor(4, List.of(1, 4, 5, 3, 2)));
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Write your code here
        var result = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == m) {
                    result.add(i + 1);
                    result.add(j + 1);
                }
            }
        }
        return result;
    }
}
