package hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static void main(String[] args) {
        var integers = gradingStudents(List.of(73, 67, 38, 33));
        System.out.println(integers);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream()
                .map(grade -> grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)))
                .collect(Collectors.toList());
    }
}
