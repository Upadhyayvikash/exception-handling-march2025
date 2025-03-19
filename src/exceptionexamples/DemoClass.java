package exceptionexamples;

public class DemoClass {
    public static void main(String[] args) {
        //example to show exception unhandled case
        int a=10, b=0, result;
        result=a/b;
        System.out.println("result is : "+result);
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }
}
