package src.org.thecodevillage.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nasimiyu daisy on 9/23/2017.
 */
public class StudentMain {

    static int Marks[] = new int[3];
    static int phpMarks[] = new int[3];
    static int pythonMarks[] = new int[3];
    static int javaMarks[] = new int[3];

    static String name[] = new String[3];


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        String grade = "";
        int average = 0;
        char grade1;


        Student s1 = new Student();
        s1.setName("Mary");
        s1.setRegNo("sc200-1453/2014");
        s1.setPhpMarks(50);
        s1.setPythonMarks(60);
        s1.setJavaMarks(90);

        Student s2 = new Student();
        s2.setName("Elkanah");
        s2.setRegNo("sc200-1332/2014");
        s2.setPhpMarks(60);
        s2.setPythonMarks(75);
        s2.setJavaMarks(54);

        Student s3 = new Student();
        s3.setName("Daisy");
        s3.setRegNo("sc200-1554/2014");
        s3.setPhpMarks(40);
        s3.setPythonMarks(70);
        s3.setJavaMarks(95);


        List<Student> myStudents = new ArrayList<>();

        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        List<Integer> myPhpMarks = new ArrayList<>();
        myPhpMarks.add(50);
        myPhpMarks.add(60);
        myPhpMarks.add(40);

        List<Integer> myPythonMarks = new ArrayList<>();

        myPythonMarks.add(60);
        myPythonMarks.add(75);
        myPythonMarks.add(70);

        List<Integer> myJavaMarks = new ArrayList<>();

        myJavaMarks.add(90);
        myJavaMarks.add(54);
        myJavaMarks.add(95);


        int ArrayLength = myPhpMarks.size();
        myPythonMarks.size();
        myJavaMarks.size();

        for (int countttt = 0; countttt < myStudents.size(); countttt++) {

            System.out.print("Name##" + myStudents.get(countttt).getName()+"\t"+"Reg No.##" + myStudents.get(countttt).getRegNo()+"\t"+"Php Marks: ##" + myStudents.get(countttt).getPhpMarks()+"\t"+
                    "Python Marks: ##" + myStudents.get(countttt).getPythonMarks()+"\t"+ "Java Marks##" + myStudents.get(countttt).getJavaMarks());
            //System.out.println("MyStudents##" + myStudents.size());
        }

        int cntt = 0;

        int sumPhp = 0;

        for (int count = 0; count < myPhpMarks.size(); count++) {

            System.out.println("Studentname" + count + "\t Value:" + myPhpMarks.get(count));

            sumPhp += myPhpMarks.get(count);
        }
        System.out.println("SumPhp;" + sumPhp + "\n\n");


        int sumPyt = 0;

        for (int count = 0; count < myPythonMarks.size(); count++) {

            System.out.println("Studentname" + count + "\t Value:" + myPythonMarks.get(count));

            sumPyt += myPythonMarks.get(count);
        }
        System.out.println("SumPyt;" + sumPyt + "\n\n");


        int sumJav = 0;

        for (int count = 0; count < myJavaMarks.size(); count++) {

            System.out.println("Studentname" + count + "\t Value:" + myJavaMarks.get(count));

            sumJav += myJavaMarks.get(count);
        }
        System.out.println("SumJav;" + sumJav + "\n\n");


        int avgPhp = sumPhp / 3;

        System.out.println("your php grade is: "+MyFunctions.getGrade(avgPhp));


        int avgPyt = sumPyt / 3;
        System.out.println("your pyth grade is: "+MyFunctions.getGrade(avgPyt));


        int avgJava = sumJav / 3;

        System.out.println("your java grade is: "+MyFunctions.getGrade(avgJava));




        int totalMarkss1 = MyFunctions.add(s1.getJavaMarks(), s1.getPhpMarks(), s1.getPythonMarks());
        int totalMarkss2 = MyFunctions.add(s2.getJavaMarks(), s2.getPhpMarks(), s2.getPythonMarks());
        int totalMarkss3 = MyFunctions.add(s3.getJavaMarks(), s3.getPhpMarks(), s3.getPythonMarks());


                int avgs1 = totalMarkss1/3;
        System.out.println("grade of s1 is: "+MyFunctions.getGrade(avgs1));


        int avgs2 = totalMarkss2/3;
        System.out.println("grade of s2 is: "+MyFunctions.getGrade(avgs2));

        int avgs3 = totalMarkss3/3;
        System.out.println("grade of s3 is: "+MyFunctions.getGrade(avgs3));


                int averages1 = MyFunctions.average(s1.getJavaMarks(), s1.getPhpMarks(), s1.getPythonMarks());
                int averages2 = MyFunctions.average(s2.getJavaMarks(), s2.getPhpMarks(), s2.getPythonMarks());
                int averages3 = MyFunctions.average(s3.getJavaMarks(), s3.getPhpMarks(), s3.getPythonMarks());
            


            System.out.println("MyStudents##" + myStudents.size());
                System.out.println("total markss1:" + totalMarkss1);
                System.out.println("total markss2:" + totalMarkss2);
                System.out.println("total markss3:" + totalMarkss3);
                System.out.println("averages1:" + averages1);
                System.out.println("averages2:" + averages2);
                System.out.println("averages3:" + averages3);


            }
        }















