package homewrok;

public class Programme15SwapValue {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        System.out.println("Before swape:");
        System.out.println(( "a = ")+ a);
        System.out.println(("b = "+ b));
        int c = a;//creating temp variable
        a=b;
        b=c;
        System.out.println("after swap value :");
        System.out.println(("a =")+ a);//print result bu using print statement
        System.out.println(("b  =")+b);

    }
}
