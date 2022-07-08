package hackerrank;

import java.util.Arrays;
import java.util.List;

public class AlternatingCharacters {

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AABAAB"));
    }

    public static int alternatingCharacters(String s) {
        // Write your code here
        int count = 0;
        char lastItem = 0;

        for(char item: s.toCharArray()){
            if(lastItem == item){
                count++;
            }
            lastItem = item;
        }
        return count;
    }

}
