package hackerrank;

import java.util.Arrays;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThree"));
    }

    public static int camelcase(String s) {
        // Write your code here
        return s.split("[ A-Z]").length;
    }
}
