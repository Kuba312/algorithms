package hackerrank;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        // 3 2 1 3
        int i = birthdayCakeCandles(List.of(18, 90, 90, 13, 90, 75, 90, 8, 90, 43));
        System.out.println(i);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer max = Collections.max(candles);
        return (int) candles.stream().filter(candle -> candle.equals(max)).count();
    }
}
