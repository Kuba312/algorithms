package findSecondTheBestStudnent;

import java.time.LocalDate;
import java.util.Date;

public class Student {

    private String name;

    private String lastname;

    private LocalDate date;

    private Double average;


    public Student(String name, String lastname, LocalDate date, Double average) {
        this.name = name;
        this.lastname = lastname;
        this.date = date;
        this.average = average;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", date=" + date +
                ", average=" + average +
                '}';
    }
}
