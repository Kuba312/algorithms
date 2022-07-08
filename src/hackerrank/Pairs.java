package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Pairs {
    public static void main(String[] args) {
        System.out.println(pairs(2, List.of(1, 5, 3, 4, 2)));
    }


    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        var set = new HashSet<Integer>(arr);
        return set.stream().mapToInt(i -> (set.contains(i + k)) ? 1 : 0).sum();
    }






    public static int pairs2(int k, List<Integer> arr) {
        // Write your code here
       var counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            var getI = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                var getJ = arr.get(j);
                if (getJ - getI == k || getI - getJ == k) {
                   counter++;
                }
            }
        }
        return counter;
    }

}
