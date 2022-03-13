package homewrok;

import java.util.Scanner;

public class Programme18Maths {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number :");//display heading in console by print statment
        int a = obj.nextInt();//storing int value in variable a

        System.out.println("Enter second number :");//display heading in console by print statement
        int b = obj.nextInt();//storing int value in variuable b

        System.out.println("125+24" + "=" + (a + b));//display sum of two number
        System.out.println("125-24" + "=" + (a - b));//display subtraction  of two number
        System.out.println("125*24" + "=" + (a * b));//display multiplication  of two number
        System.out.println("125/24" + "=" + (a / b));//display division of two number
        System.out.println("125%24" + "=" + (a %b));//display reminder  of two number

    }
}
