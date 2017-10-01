package src.org.thecodevillage.java;



import src.org.thecodevillage.common.MyDbConn;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nasimiyu daisy on 9/29/2017.
 */
public class Main {
    String name="";
    String course = "";
    String college = "";
    String regNo = "";
    String dateBirth = "";
    int javaMarks;
    int phpMarks;
    int pythonMarks;
    int totalmarks=0;


    //constructors


    public Main(String name, String course, String college, String regNo, String dateBirth, int javaMarks, int phpMarks, int pythonMarks) {
        this.name = name;
        this.course = course;
        this.college = college;
        this.regNo = regNo;
        this.dateBirth = dateBirth;
        this.javaMarks = javaMarks;
        this.phpMarks = phpMarks;
        this.pythonMarks = pythonMarks;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number of students");
        int StudentsList = input.nextInt();


        for (int i = 0; i < StudentsList; i++) {
            Student student = new Student();
            System.out.println("Enter details for student" + i);

            System.out.println("Enter name");
            student.setName(input.next());

            System.out.println("Enter Course");
            student.setCourse(input.next());

            System.out.println("Enter dateBirth");
            student.setDateBirth(input.next());

            System.out.println("Enter college");
            student.setCollege(input.next());

            System.out.println("Enter javaMarks");
            student.setJavaMarks(input.nextInt());

            System.out.println("Enter pythonMarks");
            student.setPythonMarks(input.nextInt());

            System.out.println("Enter phpMarks");
            student.setPhpMarks(input.nextInt());
            MyDbConn.insertStudent(student);

            students.add(student);
        }

    }
    }


