package findSecondTheBestStudnent;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();


        students.add(new Student("Jan", "Kowalski", LocalDate.of(1998, 7, 27), 3.55));
        students.add(new Student("Maks", "Różny", LocalDate.of(2000, 8, 11), 4.00));
        students.add(new Student("Kasia", "Nowak", LocalDate.of(1995, 2, 16), 4.00));
        students.add(new Student("Dominik", "Domański", LocalDate.of(1998, 12, 1), 5.00));
        students.add(new Student("Kamil", "Dobrobylski", LocalDate.of(2003, 3, 10), 6.00));

        Main main = new Main();


        main.findSecondTheBestStudent(students);
    }


    public Student findSecondTheBestStudent(List<Student> students) {
        Double secondLargest = students.get(0).getAverage();
        Double largest = students.get(0).getAverage();
        Student student = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAverage() > largest) {
                secondLargest = largest;
                largest = students.get(i).getAverage();
            }
            if (students.get(i).getAverage() > secondLargest && !Objects.equals(students.get(i).getAverage(), largest)) {
                secondLargest = students.get(i).getAverage();
            }
        }
        Student student2 = new Student();
        for (Student student1 : students) {
            if (student1.getAverage().equals(secondLargest)){
                student2 = student1;
            }
        }
        System.out.println(student2);
        return student2;
    }
//
//
//
//
//
////    private Student getStudent(List<Student> students, Student student, Double secondLargest) {
////        for (Student student1 : students) {
////            if (student1.getAverage().equals(secondLargest)) {
////                student = student1;
////            }
////        }
////        for (Student student1 : students)
////            if (student.getAverage().equals(student1.getAverage()))
////                if (student1.getDate().isBefore(student.getDate())) {
////                    student = student1;
////                } else {
////                    student = student1;
////                    System.out.println(student);
////                }
////        return student;
////    }
////}
//
//
////
////        Double aDouble = students.stream()
////                .map(Student::getAverage)
////                .sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst()
////                .orElseThrow(NoSuchElementException::new);
}
