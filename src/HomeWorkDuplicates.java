import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeWorkDuplicates {

    private static Integer numberOfDuplicates;

    public static void main(String[] args) {

        findDuplicateNormal(Arrays.asList(1, 2, 4, 5, 2, 4, +5, 8, 9, 4), 2);

    }

    private static void findDuplicateNormal(List<Integer> integers, int numberOfDuplicates) {
        Map<Integer, Integer> store = new HashMap<>();
        for (Integer integer : integers) {
            if (!store.containsKey(integer)) {
                store.put(integer, 1);
            } else {
                int count = store.get(integer);
                store.put(integer, count + 1);
            }
        }
        store.forEach((key, value) ->
        {
            System.out.println(key + " " + value);
        });
        System.out.println(getKeysByValue(store, numberOfDuplicates));
    }

    private static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
        Set<T> keys = new HashSet<T>();
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }


    private static void findDuplicateStream(List<Integer> integers, int numberOfDuplicates) {
        Map<Integer, Integer> store = integers
                .stream()
                .collect(Collectors.toMap(Function.identity(), s -> Collections.frequency(integers, s), (a, b) -> b));
        store.forEach((key, value) ->
        {
            System.out.println(key + " " + value);
        });
        System.out.println(getKeys(store, numberOfDuplicates));
    }

    private static <T, E> Set<T> getKeys(Map<T, E> map, E value) {
        return map.entrySet().stream()
                .filter(entry -> Objects.equals(value, entry.getValue()))
                .map(Map.Entry::getKey).collect(Collectors.toSet());
    }
}




































