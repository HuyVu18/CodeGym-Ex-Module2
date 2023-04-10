package lesson5;

public class TestStudent {
    public static void main(String[] args) {
        Student1 testStudent = new Student1();

        testStudent.setName("Walker");
        testStudent.setClasses("C07");

        System.out.println(testStudent.getName() + " " + testStudent.getClasses());
    }

}

class Student1 {
    private String name = "John";
    private String classes = "C02";

    public Student1() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
