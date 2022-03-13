package homewrok;

import java.util.Scanner;//import scanner calls with java util package

public class programme6Circle {
    public static void main(String[] args) {
        double r, area;
        Scanner obj = new Scanner(System.in);//scanner class by creating new  object name
        System.out.println("Enter the radius of circle");
        r = obj.nextDouble();//used next dubble method and storing that value in radius variable
        obj.close();//closing the scanner class

        area = Math.PI*r*r;//storing value in areA variable

        System.out.println("Area of the circle is "+ area);

    }

}


