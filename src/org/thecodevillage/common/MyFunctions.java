package src.org.thecodevillage.common;

import java.util.Scanner;

/**
 * Created by Nasimiyu Daisy on 9/17/2017.
 */
public class MyFunctions {

    public static int add(int a, int b,int c) {
        return a + b + c;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
    public static int getrem(int a, int b) {
        return a % b;}
        public static int average(int a, int b, int c) { return (a + b + c)/3; }


    public static double division(double m, double n) {
        return m / n;
    }

    public static String getGrade(int marks){
        String grade="";
        if (marks > 80) {
            System.out.println("A");
            grade ="A";
        } else if (marks > 60 && marks <= 80) {
            System.out.println("B");
            grade ="B";
        } else if (marks > 40 && marks <= 60) {
            System.out.println("C");
            grade ="C";

        } else if (marks > 20 && marks <= 40) {
            System.out.println("D");
            grade ="D";
        } else if (marks <= 20) {
            System.out.println("E");
            grade ="E";
        }

        return grade;
    }

    }




