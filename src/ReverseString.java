public class ReverseString {


    public static void main(String[] args) {

        String s = "abc";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder append = stringBuilder.append(s);

        StringBuilder reverse = append.reverse();

        System.out.println(reverse);
    }
}
