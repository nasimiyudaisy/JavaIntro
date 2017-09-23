package src.org.thecodevillage.common;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.S;

/**
 * Created by nasimiyu daisy on 9/19/2017.
 */

public class Main {

    public static void main(String[] args) {

        /**
         * Requirement : Print the Student Grades based on  their Marks
         * 1. Simple IF Statement
         * 2. IF... Else Statement
         * 3. IF...Elself Statement
         */

        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        String course = "";
        String college = "";
        String school = "";
        String regNo = "";
        String dateBirth = "";
        String Marks = "";
        int total = 0;
        int javaMarks;
        int phpMarks;
        int pythonMarks;
        int sum = 0;
        String grade = "";
        int average = 0;
        char grade1;



        System.out.println("enter the name of the student");
        s1.setName(scanner.nextLine());


        System.out.println("enter course of the student");
        s1.setCourse(scanner.nextLine());


        System.out.println("enter the college of the student");
        s1.setCollege(scanner.nextLine());

        System.out.println("enter the school of the student");
        s1.setSchool(scanner.nextLine());

        System.out.println("enter dateBirth of the student");
        s1.setDateBirth(scanner.nextLine());

        System.out.println("enter the regNo of the student");
        s1.setRegNo(scanner.nextLine());

        System.out.println("enter the javaMarks of the student");
        s1.setJavaMarks(scanner.nextInt());

        System.out.println("enter the phpMarks of the student");
        s1.setPhpMarks(scanner.nextInt());


        System.out.println("enter the pythonMarks of the student");
        s1.setPythonMarks(scanner.nextInt());


        s1.setGrade(scanner.nextLine());
        if (s1.javaMarks >= 90) {
            System.out.println("Grade A");
        } else if (s1.javaMarks >= 80 && s1.javaMarks < 90) {
            System.out.println("Grade B:");
        } else if (s1.javaMarks >= 70 && s1.javaMarks < 80) {
            System.out.println("Grade C:");
        } else if (s1.javaMarks >= 60 && s1.javaMarks < 70) {
            System.out.println("Grade D:");
        } else {
            System.out.println("Grade E");
        }

        if (s1.pythonMarks >= 90) {
            System.out.println("pt Grade A");
        } else if (s1.pythonMarks >= 80 && s1.pythonMarks < 90) {
            System.out.println("pt Grade B:");
        } else if (s1.pythonMarks >= 70 && s1.pythonMarks < 80) {
            System.out.println("pt Grade C:");
        } else if (s1.pythonMarks >= 60 && s1.pythonMarks < 70) {
            System.out.println("pt Grade D:");
        } else {
            System.out.println("pt Grade E");
        }
        if (s1.phpMarks >= 90) {
            System.out.println("p Grade A");
        } else if (s1.phpMarks >= 80 && s1.pythonMarks < 90) {
            System.out.println("p Grade B:");
        } else if (s1.phpMarks >= 70 && s1.phpMarks < 80) {
            System.out.println("p Grade C:");
        } else if (s1.phpMarks >= 60 && s1.phpMarks < 70) {
            System.out.println("p Grade D:");
        } else {
            System.out.println("p Grade E");
        }

        sum = MyFunctions.add(s1.getJavaMarks(), s1.getPhpMarks(), s1.getPythonMarks());
        average = MyFunctions.average(s1.getJavaMarks(), s1.getPhpMarks(), s1.getPythonMarks());

        if (average >= 90) {
            grade1 = 'A';
        } else if (average >= 80 && average < 90) {
            grade1 = 'B';
        } else if (average >= 70 && average < 80) {
            grade1 = 'C';
        } else if (average >= 60 && average < 70) {
            grade1 = 'D';
        } else {
            grade1 = 'E';
        }


        System.out.println("Name:" + s1.getName());
        System.out.println("Course:" + s1.getCourse());
        System.out.println("College:" + s1.getCollege());
        System.out.println("regNumber:" + s1.getRegNo());
        System.out.println("Sum##" + sum);
        System.out.println("grade1##" + grade1);



        }

    }




