package lesson12.ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("A", 20, "Tp.HCM");
        Student student2 = new Student("D", 23, "LA");
        Student student3 = new Student("C", 18, "DT");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);

        for (Map.Entry<Integer, Student> e : studentMap.entrySet()) {
            System.out.println(e.toString());
        }

        System.out.println("-----");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student e : students) {
            System.out.println(e.toString());
        }
    }
}
