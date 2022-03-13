package homewrok;

import java.util.Scanner;

public class Programme7Temperature {
    public static void main(String[] args) {
        double t, c;
        Scanner obj = new Scanner(System.in);//scanner class

        System.out.println("Enter fahrenheit tempreture ");//print heading in scanner by print statement
        t = obj.nextDouble();//read temperature value by using object and store in variable t

        System.out.println("celcius tempreture is"+ celcius(t));//calling celcius method as celcius(t) and print it in console
    }

//return static method with parameter
     static double celcius(double f){
        return (f-32)*5/9;

    }

}
