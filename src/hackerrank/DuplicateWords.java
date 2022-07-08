package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        //input:
        // 5
        //Goodbye bye bye world world world
        //Sam went went to to to his business
        //Reya is is the the best player in eye eye game
        //in inthe
        //Hello hello Ab aB

        //output:
//        Goodbye bye world
//        Sam went to his business
//        Reya is the best player in eye game
//        in inthe
//        Hello Ab


        String regex = "/* Write a RegEx matching repeated words here. */";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);


    }
}
