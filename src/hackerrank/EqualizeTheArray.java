package hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EqualizeTheArray {
    public static void main(String[] args) {

        System.out.println(equalizeArray(List.of(1, 2, 2, 3)));
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Map<Integer, Long> collect = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        var integers = new ArrayList<Integer>(arr);
        var set = new HashSet<Integer>();
        ArrayList<Integer> toRemove;
        var list = new ArrayList<Long>();
        final var collect1 = new List[]{null};
        collect.forEach((key, value) -> {
            list.add(value);
            collect1[0] = getKey(collect, Collections.max(list)).collect(Collectors.toList());
        });

        toRemove = integers.stream().filter(integer -> integer.equals((Integer) collect1[0].get(0))).collect(Collectors.toCollection(ArrayList::new));
        integers.removeAll(toRemove);

        return integers.size();
    }

    public static <K, V> Stream<K> getKey(Map<K, V> map, V value) {
        return map
                .entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey);
    }

}
