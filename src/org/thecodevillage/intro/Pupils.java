package src.org.thecodevillage.intro;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * Created by nasimiyu daisy on 9/27/2017.
 */
public class Pupils {

    String name;
    String course;
    String regNo;
    String dateBirth;
    int marks;
    int javaMarks;
    int phpMarks;
    int pythonMarks;

    public static void main ( String [] args) {

        /* Linked List Declaration*/

        LinkedList<String> someList=new LinkedList<>();
        LinkedList<Pupils> someListPupils=new LinkedList<>();

        /*add (String Element) is used for adding the elements to the Linked List*/

        someList.add("Student 1");
        someList.add("Student 2");
        someList.add("Student 3");
        someList.add("Student 4");
        someList.add("Student 5");
        someList.add("Student 6");
        someList.add("Student 7");


        /*Display Linked List Content*/

        System.out.println();
        System.out.println(" someList Elements");
        System.out.print("\t" + someList);




    }
}
