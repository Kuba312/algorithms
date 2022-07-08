package job;

import java.util.Enumeration;
import java.util.List;

public class User  {

    private Double salary;
    private String name;
    private Integer age;
    private Job typeOfJob;

    public User(Double salary, String name, Integer age, Job typeOfJob) {
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.typeOfJob = typeOfJob;
    }

    public User() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Job getTypeOfJob() {
        return typeOfJob;
    }

    public void setTypeOfJob(Job typeOfJob) {
        this.typeOfJob = typeOfJob;
    }

    @Override
    public String toString() {
        return "User{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", typeOfJob=" + typeOfJob +
                '}';
    }
}
