package homewrok;

public class Programme4 {
    int a = 100;//instance variable
    int b = 200;//instance variable
    static String name = "kinjal";// static variable
    static String surname = "savani";// static variable

    // instance method
    public void method1() {
        System.out.println(a);//calling instance variable under instance method by print statement
        System.out.println(b);//calling instance variable under instance method by print statement
        Programme4 obj1 = new Programme4();//create object
        System.out.println(obj1.name);//calling static variable under  instance method by print statement
        System.out.println(obj1.surname);//calling static variable under  instance method by print statement
    }

    //static method
    public static void method2() {
        System.out.println(name);//calling static variable under static method with print statement
        System.out.println(surname);//calling static variable under static method with print statement
        Programme4 obj2 = new Programme4();//create an object
        System.out.println(obj2.a);//calling instance variable under static method with print statement
        System.out.println(obj2.b);//calling instance variable under static method with print statement
    }

    // main method---- just wanted to see if main  method work if we use after other methods
    public static void main(String[] args) {
        method2();//static method to main method
        Programme4 obj3 = new Programme4();
        obj3.method1();//instance method to static method
    }
}


