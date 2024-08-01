package session16.demo_student_form_validate.config.model;

import javax.validation.constraints.NotBlank;

public class Student {
    @NotBlank(message = "Chưa nhập student id")
    private String stuId;
    @NotBlank(message = "Chưa nhập full name")
    private String fullName;
    @NotBlank(message = "Chưa nhập address")
    private String address;
    @NotBlank(message = "Chưa nhập class name")
    private String className;

    public Student() {
    }

    public Student(String stuId, String fullName, String address, String className) {
        this.stuId = stuId;
        this.fullName = fullName;
        this.address = address;
        this.className = className;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
