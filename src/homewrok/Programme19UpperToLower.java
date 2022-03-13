package homewrok;

import java.util.Scanner;

public class Programme19UpperToLower {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter string  value  in uppercase :");//display in console by print statement
        String upperCase=obj.nextLine();// storing value in string variable named lowercase

        String lowerCase= upperCase.toLowerCase();///storing value in variable lowercase
        System.out.println("Get the result in Lowercase :" + lowerCase);
    }//inout data is THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
}
