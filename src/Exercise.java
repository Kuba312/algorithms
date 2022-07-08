import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {

        return integers.stream()
                .filter(Objects::nonNull)//Returns true if the provided reference is non-null otherwise returns false.
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))//identity returns a function that always returns its input argument. Counts the number of input elements.
                .entrySet()//Returns a Set view of the mappings contained in this map
                .stream()
                .filter(entry -> entry.getValue().equals((long) numberOfDuplicates))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
