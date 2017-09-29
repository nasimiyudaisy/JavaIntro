package src.org.thecodevillage.intro;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nasimiyu daisy on 9/27/2017.
 */
public class StudentData {


    String record;
    String name;
    String course = "";
    String college = "";
    String regNo = "";
    String dateBirth = "";
    int javaMarks;
    int phpMarks;
    int pythonMarks;

    StudentData(String record, String name, String course, String college, String regNo, String dateBirth, int javaMarks, int phpMarks, int pythonMarks) {

        this.record = record;
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

        /*Linked List Declaration*/

        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> someList=new LinkedList<>();
        LinkedList<StudentData > someListStudentData=new LinkedList<>();

        /**
         * add(String Element) is used for adding
         * the elements to the linked List
         */


        someList.add("Daisy");
        someList.add("Elkanah");
        someList.add("Hilda");
        someList.add("Nicholas");
        someList.add("Juyne");


        /*Display some List Content*/
        System.out.println("some list content:" + someList);

        // size of the list
        System.out.println("size of the some list:" + someList.size());

        // get method

        System.out.println("Element at 0 index:" + someList.get(0));

        // set method
        someList.set(0, "zero");
        System.out.println(someList);

        someList.remove(0);
        System.out.println("some list after removing the element at index o:" +someList);




    }
        }





