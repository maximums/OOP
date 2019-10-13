package Laborator1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int foundationYear;
    private List<Student> students = new ArrayList<Student>();
    University (String name , int foundationYear){
        this.name = name;
        this.foundationYear = foundationYear;
    }
    public void adding(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }


}