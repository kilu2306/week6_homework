package homewrok;
import java.util.Scanner;
public class Programme9UpperCaseLowerCase {

    public static void main(String[] args) {
        String  upperCase ;
        Scanner obj= new Scanner(System.in);//reading data by using scanner class  and creat scanner object
        System.out.println("enter upercase string =");//use print statement to give heading in console
        upperCase=obj.nextLine();///storing value in variable upperCase

        String lowerCase= upperCase.toLowerCase();// storing value in variable upperCase1 from javatolowercase() method
        System.out.println("the lowercase string :"+ lowerCase);//printing statment in console with concatenation by print statement

    }
}
