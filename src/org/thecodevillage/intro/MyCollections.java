package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.Student;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by nasimiyu daisy on 9/23/2017.
 */
public class MyCollections {
    //hashmap
    //list
    //Array
    //LinkedList
    //ArrayList
    static int marks[] = new int[10];

    static String name[] = new String[10];

    public static void main(String[] args) {
        marks[0] = 40;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 60;
        marks[5] = 80;
        marks[6] = 50;
        marks[7] = 80;
        marks[8] = 70;
        marks[9] = 80;

        int sum = 0;
        //String name= "";


        name[0] = "Daisy";
        name[1] = "Elkanah";
        name[2] = "Benson";
        name[3] = "Sunday";
        name[4] = "Hilda";
        name[5] = "Juyne";
        name[6] = "Nick";
        name[7] = "Francis";
        name[8] = "Makena";
        name[9] = "Rose";


        int arrayLength = marks.length;

        for (int count = 0; count < marks.length; count++) {

            System.out.println("Item" + count + "\t Value:" + marks[count]);
        }
        for (int count = 0; count < marks.length; count++) {

            System.out.println("Studentname" + count + "\t Value:" + name[count]);
        }
        System.out.println("Sum;" + sum + "\n\n");


        //while
        int counter = 0;
        while (counter < marks.length)

        {
            System.out.println("Marks##" + marks[counter]);
            counter++;

        }
        //do While
        int i = 15;
        do {
            if (i > marks.length)
                System.out.println("number exceeded");
            else {
                System.out.println("Marks##" + marks[1]);
                i++;
            }
        } while (i < marks.length);

        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Merit");
                break;

            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Weak");
                break;

            case "E":
                System.out.println("Very Weak");
                break;
            default:
                System.out.println("Not defined");
        }
        /**
         * List
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(50);
        myList.add(60);
        myList.add(60);
        myList.add(70);
        myList.add(90);

        List<String> myStringList = new ArrayList<>();

        myStringList.add("Daisy");
        myStringList.add("Amani");
        myStringList.add("Sophie");
        myStringList.add("Derrick");
        myStringList.add("Hilda");
        myStringList.add("Kibet");


        System.out.println("MyList##" + myList.get(0));
        System.out.println("MyList##" + myList.size());

        int cnt = 0;

        while (cnt < myStringList.size()) {
            System.out.println("MyStringList##" + myStringList.get(cnt));
            System.out.println("MyStringList##" + myStringList.size());
            cnt++;
        }


        int hint = 0;

        while (hint < myList.size()) {

            System.out.println("MyList##" + myList.get(4));
            System.out.println("MyList##" + myList.size());
            hint++;

            for (Integer item : myList) {
                System.out.println("Mylist##" + item);


                Car toyota = new Car();
                toyota.setName("Ractis");
                toyota.setColor("Red");


                Car subaru = new Car();
                subaru.setName("Vitz");
                subaru.setColor("Orange");

                Car nissan = new Car();
                nissan.setName("Legacy");
                nissan.setColor("Black");

                List<Car> myCars = new ArrayList<>();

                myCars.add(toyota);
                myCars.add(subaru);
                myCars.add(nissan);


                int crt = 0;

                while (crt < myCars.size()) {

                    System.out.println("MyCars##" + myCars.get(0).getName());
                    System.out.println("MyCars##" + myCars.size());
                    crt++;


                    for (int count = 0; count < myCars.size(); count++) {

                        System.out.println("MyCars##" + myCars.get(count).getName());
                        System.out.println("MyCars##" + myCars.get(count).getColor());
                        System.out.println("MyCars##" + myCars.size());

                    }

                }

            }


        }


    }
}