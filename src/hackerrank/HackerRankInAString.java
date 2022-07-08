package hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HackerRankInAString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
    }

    public static String hackerrankInString(String s) {
        // Write your code here
        var results = Arrays.stream(s.split("")).collect(Collectors.toList());
        var original = Arrays.stream("hackerrank".split("")).collect(Collectors.toList());
        var seqIdx = 0;
        for (String s1 : results) {
            if (seqIdx == original.size()) {
                break;
            }
            if (original.get(seqIdx).equals(s1)) {
                seqIdx++;
            }
        }
        return seqIdx == original.size() ? "YES" : "NO";
    }

}
