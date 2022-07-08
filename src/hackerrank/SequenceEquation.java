package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class SequenceEquation {
    public static void main(String[] args) {
        System.out.println(permutationEquation(List.of(5, 2, 1, 3, 4)));
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        var integers = new ArrayList<Integer>();
        var result = new ArrayList<Integer>();
        var list = new ArrayList<>(p);
        Collections.sort(list);
        for (Integer integer : list) {
            for (int i = 0; i < p.size(); i++) {
                var index = i + 1;
                if (integer.equals(p.get(i))) {
                 integers.add(index);
                }
            }
        }
        for (Integer integer : integers) {
            IntStream.range(0, p.size()).forEach(i -> {
                var index = i + 1;
                if (integer.equals(p.get(i))) {
                    result.add(index);
                }
            });
        }
        return result;
    }


}
