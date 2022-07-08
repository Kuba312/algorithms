package hackerrank;

import java.util.LinkedList;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {

        bonAppetit(List.of(3, 10, 2, 9), 1, 7);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        var list = new LinkedList<Integer>(bill);
        list.remove(list.get(k));
        var count = list.stream().mapToInt(integer -> integer).sum();
        var costPerPerson = count / 2;

        if (costPerPerson == b) {
            System.out.println("Bon Appetit");
        } else {
            var rest = b - costPerPerson;
            System.out.println(rest);
        }
    }
}
