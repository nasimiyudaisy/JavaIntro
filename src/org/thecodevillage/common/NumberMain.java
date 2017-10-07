package src.org.thecodevillage.common;

import java.util.Scanner;

/**
 * Created by nasimiyu daisy on 10/7/2017.
 */
public class NumberMain {
    int z=0;

    public static void main(String[]args) {
        int a;

        Scanner scanner = new Scanner(System.in);
                System.out.print("enter z:");
        int z = scanner.nextInt();

        for (a=0;a <10;a++){
            System.out.println(a+"x"+z +"="+z*a);

        }



    }


}

