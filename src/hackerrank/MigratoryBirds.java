package hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MigratoryBirds {

    public static void main(String[] args) {

        System.out.println(migratoryBirds(List.of(1, 4, 4, 4, 5, 3)));

    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Long> frequency = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Long> values = new ArrayList<>(frequency.values());
        Stream<Integer> keys = null;
        for (Long value : values) {
            if (value.equals(Collections.max(values))){
              keys = keys(frequency, value);
            }
        }
        List<Integer> collect = Objects.requireNonNull(keys).collect(Collectors.toList());
        return Collections.min(collect);
    }
    public static  <K, V> Stream<K> keys(Map<K, V> map, V value) {
        return map
                .entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey);
    }

}
