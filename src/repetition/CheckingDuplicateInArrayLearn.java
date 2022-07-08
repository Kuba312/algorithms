package repetition;

import java.util.*;

public class CheckingDuplicateInArrayLearn {

    public static void main(String[] args) {

        String[] input = {"one", "two", "one"};

        System.out.println(checkingDuplicateInArrayUsingSet(input));
    }

    public static boolean checkingDuplicateInArrayUsingSet(String[] input) {
        List<String> inputString = Arrays.asList(input);
        Set<String> inputSet = new HashSet<>(inputString);

        return inputSet.size() < inputString.size();

    }

}
