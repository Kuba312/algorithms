package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoStrings {
    public static void main(String[] args) {
        System.out.println(twoStrings("hello","world"));
    }

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        var stringFirst = splitString(s1);
        var stringSecond = splitString(s2);
        var list = new ArrayList<>(stringFirst);
        list.retainAll(stringSecond);

        System.out.println(list);

        return "";
    }


    public  static List<String> splitString(String str){
        return Arrays.asList(str.split(""));
    }

}
