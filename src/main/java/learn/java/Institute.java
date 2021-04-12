package learn.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Institute {
    String instituteName;
    List<Department> departmentList;

    public Institute() {
    }

    public Institute(String instituteName, List<Department> departmentList) {
        this.instituteName = instituteName;
        this.departmentList = departmentList;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public String toString() {
        return "Institute{" +
                "instituteName='" + instituteName + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }

    public Map<String, Integer> totalStudent(){
        int totalStudentCount = 0;
        Map<String, Integer> count = new HashMap<>();
        for (Department dept : departmentList) {
            int deptStudentCount = 0;
            for (Student student: dept.studentList) {
                totalStudentCount++;
                deptStudentCount++;
                count.put(dept.deptName, deptStudentCount);
            }
        }
        return count;
    }
}
