package src;



import src.org.thecodevillage.common.MyFunctions;
import src.org.thecodevillage.intro.Car;

import java.util.Scanner;

public class Example{


    public static void main(String[] args) {
        String str = "one";
        int x = 5;
        int y = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        x = scanner.nextInt();

        System.out.println("enter 2nd number");
        y = scanner.nextInt();

        x = y + x + 5 + 7;
        double m, n = 0;
        m = 80.65;
        n = 10.6;
        double result = MyFunctions.division(m, n);
        int sum = 0;
        sum = MyFunctions.add(x,y,x);
        int mult = 0;
        mult = MyFunctions.multiply(x, y);
        int sub = 0;
        sub = MyFunctions.subtract(x, y);
        int div = 0;
        div = MyFunctions.division(x, y);
        int rem = 1;
        int getrem = MyFunctions.getrem(x, y);

        System.out.println("We are learning Java Today");
        System.out.println ("Sum##"+sum);
        System.out.println("Mult##"+mult);
        System.out.println("Sub##"+sub);
        System.out.println("Div##"+div);
        System.out.println("getrem##"+getrem);
        System.out.println("double##"+result);

        Car toyota=new Car();
        System.out.println("enter the name");
        toyota.setName(scanner.next());

        System.out.println("Name:"+toyota.getName());



    }
}

