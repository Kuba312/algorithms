import javax.xml.namespace.QName;
import java.util.HashSet;
import java.util.Set;

public class FindMoreThanOneDuplicateInArray {

    public static void main(String[] args) {

        String[] names = {"Java", "JavaScript", "Python", "C", "Ruby", "Java", "Java"};
        int[] ints = {1, 2, 3, 3, 2, 5, 5};
        foundDuplicates(ints);
    }

    private static void foundDuplicates(int[] names) {
        Set<Integer> store = new HashSet<>();

        int count = 0;
        for (int name : names) {
            if (!store.add(name)) {
                count++;
                System.out.println(name);
            }
        }
    }
}

