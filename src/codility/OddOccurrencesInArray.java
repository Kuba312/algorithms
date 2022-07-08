package codility;

import java.util.*;

//Find a numbers without a pair in array
public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] array = {5, 4, 1, 4, 5};

        foundDuplicates(array);
    }

    private static void foundDuplicates(int[] names) {
        Set<Integer> store = new HashSet<>();
        for (int name : names) {
            if (!store.contains(name)) {
                store.add(name);
            }else {
                store.remove(name);
            }
        }
        System.out.println(store);
    }
}

