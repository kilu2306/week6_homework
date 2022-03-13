package homewrok;
import java.util.Scanner;
public class programme16BinaryNumber {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);//scanner object created to read data from system.in
        System.out.println("Enter first binary number :");///displaying  heading in console by print statement
        String a = obj.next();//reading data from console and store in form of string in variable a

        System.out.println("Enter second binary number :");//displaying  heading in console by print statement
        String b= obj.next();//reading data from console and storing inform of string

        int n1 =Integer.parseInt(a,2);//need  to convert value in int so need to use wrapper class and storing value in  n1
        int n2 =Integer.parseInt(b,2);//need  to convert value in int so need to use wrapper class and storing value in  n1
        int n3= n1+n2;// formula

        System.out.println("Sum of two binary number  : " + Integer.toBinaryString(n3));//need to convert binary number to int and print display result
    }
}
