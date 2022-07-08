package hackerrank;

import java.util.Arrays;
import java.util.List;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    public static String pangrams(String s) {
        // Write your code here
        var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        var alphabetList = Arrays.asList(alphabet.split(""));
        var sentence = Arrays.asList(s.replaceAll("\\s+", "").toUpperCase().split(""));
        return  sentence.containsAll(alphabetList) ? "pangram" : "not pangram";
    }

}
