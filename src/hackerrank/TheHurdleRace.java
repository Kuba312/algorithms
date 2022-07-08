package hackerrank;

import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

    public static void main(String[] args) {
        System.out.println(hurdleRace(1, List.of(1, 2, 3, 3, 2)));
    }

    public static int hurdleRace(int k, List<Integer> height) {
        return k >= Collections.max(height) ? 0 : Collections.max(height) - k;
    }
}
