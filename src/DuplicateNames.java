import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNames {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Kuba");
        list.add("Patryk");
        list.add("Jan");
        list.add("Jan");
        list.add("Max");
        list.add("Kuba");
        System.out.println(findDuplicateName(list));
    }

    public static Map<String, Long> findDuplicateName(List<String> names) {
        return names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
