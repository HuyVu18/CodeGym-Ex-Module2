package lesson12.ex3;

import lesson12.ex2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("X", 26, "DT");
        Student student2 = new Student("Z", 21, "KG");
        Student student3 = new Student("Y", 24, "CT");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        for (Student e : studentList) {
            System.out.println(e.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("SORT FOR AGE:");
        for (Student e : studentList) {
            System.out.println(e.toString());
        }
    }
}
