package homewrok;//calling static method in  main method

public class Programme2 {
    static int a = 12;//static variable
    static String b = "kinjal";

    //main method
    public static void main(String[] args) {
        method1();//calling static method to main method
    }

    //static method
    public static void method1() {
        System.out.println(a);//calling static variable in static method with print statement
        System.out.println(b);//calling static variable in static method with print statement
    }
}
