
public class Example{

public static void main(String[] args){

String str="one";
int x = 5;
int y = 10;
x= y+x+5+7;
int sum=0;
sum =add(x,y);

System.out.println("We are learning Java Today");
System.out.println ("Sum##"+sum);

}

public static int add(int a,int b) {
    return a + b;
}
public static int multiply (int a, int b) {
    return a * b;
}

}