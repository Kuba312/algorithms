package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        System.out.println(beautifulDays(123, 456789, 189));
    }

    public static int beautifulDays(int i, int j, int k) {

        var list = new ArrayList<Integer>();
        int result = 0;
        for (int index = i; index <= j; index++) {
            StringBuilder day = new StringBuilder(String.valueOf(index));
            int xReverse = Integer.parseInt(day.reverse().toString());
            if (Math.abs(index-xReverse) % k == 0){
                result++;
            }
        }


        return result;
    }
}
