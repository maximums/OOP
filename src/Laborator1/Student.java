package Laborator1;

public class Student {
    private String name;
    private int age;
    private float mark;
    Student(String name , int age , float mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public int getAge() {
        return age;
    }

    public float getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }
}
