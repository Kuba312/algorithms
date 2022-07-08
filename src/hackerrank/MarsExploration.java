package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MarsExploration {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }

    public static int marsExploration(String s) {
        // Write your code here
        var results = Arrays.stream(s.split("")).collect(Collectors.toList());
        var repeated = Arrays.asList(new String(new char[s.length() / 3]).replace("\0", "SOS").split(""));

        return (int) IntStream.range(0, repeated.size()).filter(i -> !repeated.get(i).equals(results.get(i))).count();
    }
}
