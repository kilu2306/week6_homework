package homewrok;// instance method to  main method
public class Programme1 {
    int a=12;//instance variable
    String name ="kinjal";//instance variable

    //main method
    public static void main(String[] args) {
        Programme1 obj = new Programme1();//create object
        obj.method1();//calling instance method
    }
    //instance method
    public void method1(){
        System.out.println(a);//calling instance int variable in print statement under instance method
        System.out.println(name);
    }

}
