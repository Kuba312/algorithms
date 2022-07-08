package hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RepeatedString {
    public static void main(String[] args) {
        long aba = repeatedString("aba", 10);
        System.out.println(aba);
    }

    static long repeatedString(String s, long n) {
        long num = n / s.length();
        long rem = n % s.length();
        long cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                cnt += num;
                if (i < rem) cnt++;
            }
        }
        return cnt;
    }
        public static long repeatedString2(String s,long n){
            return LongStream.range(0, n)
                    .mapToObj(i -> Arrays.asList(s.split("")))
                    .flatMap(Collection::stream)
                    .limit(n)
                    .filter(s1 -> s1.equals("a"))
                    .count();
        }
    }
