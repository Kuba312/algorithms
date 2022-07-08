package hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SparseArrays {
    public static void main(String[] args) {
        System.out.println(matchingStrings(List.of("def", "de", "fgh"), List.of("de", "lmn", "fgh")));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        var result = new ArrayList<Integer>();
        for (String query : queries) {
            result.add(Collections.frequency(strings, query));
        }
        return result;
    }
}
