package luong_form.model;

import java.util.Date;

public class Student {
    private String id;
    private String fullName;
    private String address;
    private String className;

    public Student() {
    }

    public Student(String id, String fullName, String address, String className) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
