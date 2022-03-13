package homewrok;

public class Programme5Calculator {
    // main method
    public static void main(String[] args) {
        addition(10,20,30,40);//calling  static addition method by giving value in main method
        subtraction(40,10);//calling static subtraction method by giving value to variable in main method
        Programme5Calculator obj1= new Programme5Calculator();
        obj1.division(100,5);// calling instance method by giving value to variable in main method
        obj1.multiplication(2,4,6,8);// calling instance method by giving value to variable in main method
    }

    //static method
    public static void addition (int a , int b, int c , int d){
        System.out.println(a+b+c+d);
    }
    //static method
    public static void subtraction (int d,int a){
        System.out.println(d-a);
    }

    //instance method
    public  void multiplication (int a ,int b,int c,int d){
        System.out.println(a*b*c*d);
    }
    //instance method
    public void division(int d ,int b){
        System.out.println(d/b);
    }
}
