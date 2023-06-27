package Exam;

public class Minion {
    private String name;
    private int age;

    public Minion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // speak
    void speak() {
        System.out.println("King " + name + " !");
    }

    // info
    void info(){
        System.out.print(name + " - Age: " + age);
    }

    // getter age
    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}
