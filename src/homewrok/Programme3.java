package homewrok;

public class Programme3 {
    static String name="my java programme";//static variable
     int b= 3;//instance variable

// main method
    public static void main(String[] args) {
        method2();// calling static method
        Programme3 obj2= new Programme3();
        obj2.method1();// calling instance method
    }
    //instance method
    public void method1(){
        System.out.println(b);//calling instance variable in instance method
        Programme3 obj= new Programme3();//creat object
        System.out.println(obj.name);//calling static variable in instance method
    }

    //static method
    public static void method2(){
        System.out.println(name);////calling static variable in static method with print statement
        Programme3 obj1=new Programme3();//object create
        System.out.println(obj1.b);//calling instance variable in static method with print statement
    }

}
