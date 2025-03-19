package exceptionexamples;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a = 10, b = 0, result=0;
        try {
            //monitor code
            System.out.println("inside try block before exception occurred");
            result = a / b; //divided by zero

            System.out.println("at the end of try block after exception occurred");
        } catch (ArithmeticException e) {
            //handling exception
            System.out.println("Exception occurred : " + e.getMessage());
        }
        System.out.println("result is : "+result);
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }
}
