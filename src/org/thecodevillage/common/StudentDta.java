package src.org.thecodevillage.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nasimiyu daisy on 9/28/2017.
 */
public class StudentDta {

    String name;
    String course = "";
    String college = "";
    String regNo = "";
    String dateBirth = "";
    int noOfStudents;
    ArrayList<Student> studentList;

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public static void main(String[] args) {

    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
    //constructors


    public StudentDta(int noOfStudents) {

    }

    public StudentDta(String name, String course, String college, String regNo, String dateBirth) {
        this.name = name;
        this.course = course;
        this.college = college;
        this.regNo = regNo;
        this.dateBirth = dateBirth;
        this.noOfStudents = 0;
        studentList = new ArrayList<Student>();

        Student student = new Student();
        String string = new String();

    }

    public static void addStudent(Student newStudent) {
        List<String> studentList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            studentList.add("new Student");
        }

        System.out.println("StudentList" + studentList.size());
    }
}

/*if (i<studentlist.size()==noOfStudents) {
System.out.println("the class is full hence cannot enroll)
}
else {
student.List.add(newStudent);
}

public static String toString() {
return "Name:"+this.name.........
 */






