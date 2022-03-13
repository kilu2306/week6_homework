package homewrok;

import java.util.Scanner;

public class Programme10MultiplicationTable {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);//create scanner class object
        System.out.println("enter number:");//print out heading by using print statement

        int i = obj.nextInt();//storing value  in variable i
        for (int p = 1; p <= 10; p++) //create for loop
        {
            System.out.println(i + " * " + p + "=" + i * p);//print statement with concatenation in form of table
        }
    }
}
