package bean;

import java.util.Arrays;

public class Teacher extends Person{
    private String schoolName;
    private double salary;
    private Student [] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "schoolName='" + schoolName + '\'' +
                ", salary=" + salary +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
