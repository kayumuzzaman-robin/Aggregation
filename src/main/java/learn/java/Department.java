package learn.java;

import java.util.List;

public class Department {
    String deptName;
    List<Student> studentList;

    public Department() {
    }

    public Department(String deptName, List<Student> studentList) {
        this.deptName = deptName;
        this.studentList = studentList;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
