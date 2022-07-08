import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class checkingDuplicateInArray {
    public static void main(String[] args) {

        String[] strings = {"one", "two", "one"};

        System.out.println("Checking array with duplicates using Set: " +
                checkingDuplicateUsingSet(strings));
    }

    public static boolean checkingDuplicateUsingSet(String[] input) {
        List<String> strings = Arrays.asList(input);
        Set<String> set = new HashSet<>(strings);

        return set.size() < strings.size();
    }
}
