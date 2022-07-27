package oscarblancarte.ipd.builder.dto;

public class Department {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
