package repetition;

public class ReverseStringLearn2 {

    public static void main(String[] args) {
        String abc = "abc";
        System.out.println(reverse(abc));
    }

    public static String reverse(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = chars.length-1; i >=0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
