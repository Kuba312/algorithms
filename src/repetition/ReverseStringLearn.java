package repetition;

public class ReverseStringLearn {

    public static void main(String[] args) {


        String abc = "joł";

        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder append = stringBuilder.append(abc);

        StringBuilder reverse = append.reverse();

        System.out.println(reverse);
    }
}
