package lesson17.studentList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String filePath, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "A", "DN"));
        students.add(new Student(2, "D", "LA"));
        students.add(new Student(3, "X", "CT"));
        students.add(new Student(4, "I", "VT"));
        writeDataToFile("src/lesson17/studentList/student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("src/lesson17/studentList/student.txt");
        for (Student e : studentDataFromFile)
            System.out.println(e);
    }
}
