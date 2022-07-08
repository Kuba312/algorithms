public class ReverseStringWithoutStringBuilder {

    public static void main(String[] args) {
        String abc = "abc";

        System.out.println(reverseStr(abc));
    }


    public static String reverseStr(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();

    }

}
