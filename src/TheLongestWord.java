import java.util.Arrays;

public class TheLongestWord {


    public static void main(String[] args) {
        String s = "This the strange day because i do not know what is happening to me";
        String [] word = s.split(" ");

        String macbethWord = "";
        for (String value : word) {
            if (value.length() >= macbethWord.length()) {
                macbethWord = value;
            }
        }
        System.out.println(macbethWord);
    }
}
