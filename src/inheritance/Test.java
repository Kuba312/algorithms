package inheritance;

 abstract class Test1 {
    private String name;
    private int age;


    abstract void print();

    public Test1(String name, int age) {
        this.name = name;
        this.age = age;
//        System.out.println(name + " " + age + " ");

    }
     void  print2(){

    }
}

class Test2 extends Test1 {

    private String sex;

    public Test2(String name, int age, String sex) {
        super("janek", age);
        this.sex = sex;
     //   System.out.println(name + " " + age + " " + sex);
    }

    @Override
    void print() {
        System.out.println("elo");
    }
}

public class Test {
    public static void main(String[] args) {
        Test2 asd = new Test2("asia", 20, "female");
        asd.print();
    }
}
