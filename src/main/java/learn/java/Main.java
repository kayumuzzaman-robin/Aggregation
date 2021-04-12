package learn.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Abul", 10, "CSE");
        Student student2 = new Student("Kasem", 20, "CSE");
        Student student3 = new Student("Mokbul", 25, "EEE");

        List<Student> cseStudents = new ArrayList<>();
        List<Student> eeeStudents = new ArrayList<>();

        cseStudents.add(student1);
        cseStudents.add(student2);
        eeeStudents.add(student3);

        Department department1 = new Department("CSE", cseStudents);
        Department department2 = new Department("EEE", eeeStudents);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);

        Institute institute = new Institute("AIUB", departmentList);

        System.out.println(institute.toString());
        System.out.println("Total student in CSE: " + institute.totalStudent().get("CSE"));
        System.out.println("Total student in EEE: " + institute.totalStudent().get("EEE"));
    }
}
