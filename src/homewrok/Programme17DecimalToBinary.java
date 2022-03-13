package homewrok;
import java.util.Scanner;
public class Programme17DecimalToBinary {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println(" Enter decimal number : ");//display heading on console by print statement
        int a= obj.nextInt();//storing int value in variable a
        System.out.println("Binary number of "+a+ " is :");//display heading on console by print statement
        System.out.println(Integer.toBinaryString(a));//converting decimal number to binary number by calling tobinarystring static method

        /*to convert binary  number to decimal number--------------just for practice and understanding
        System.out.println(" Enter binary number  : ");//display heading on console by print statement
        String  b= obj.next();
        System.out.println(" decimal  number of "+a+ " is :");//display heading on console by print statement
        System.out.println(Integer.parseInt(b,2));// convert binary number to integer number with toparseint static method
        */

    }
}
