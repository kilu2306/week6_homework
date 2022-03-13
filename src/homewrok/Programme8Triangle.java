package homewrok;

import java.util.Scanner;

public class Programme8Triangle {
    public static void main(String[] args) {

        double h ,b ,area;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter high and base");

        h=obj.nextDouble();//read high value and storing value in variable h
        b=obj.nextDouble();// read high value and storing value in variable b

        area= h*b/2;//fromula to get area of triangle
        System.out.println("Area of triangel"+ area);//use print statement with concatenation

    }
}
