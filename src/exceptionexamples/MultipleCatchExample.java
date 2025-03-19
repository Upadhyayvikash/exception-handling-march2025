package exceptionexamples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int a = 10, b = 10, result=0;
        try {
            //monitor code
            System.out.println("inside try block before exception occurred");
            result = a / b; //divided by zero

            String msg1="hi hello";
            String msg2=null;
            System.out.println("length of msg1 is : "+msg1.length());
            System.out.println("length of msg2 is : "+msg2.length());

            int arr[] = {23, 12, 4, 35};
            System.out.println("length of arr is : " + arr.length);
            System.out.println("value of arr[0] is : " + arr[0]);
            System.out.println("value of arr[6] is : " + arr[6]);

            System.out.println("at the end of try block after exception occurred");
        } catch (ArithmeticException e) {
            //handling exception
            System.out.println("Exception occurred : " + e.getMessage()+"..."+e.getClass());
        }
        catch (NullPointerException e){
            System.out.println("Exception occurred : "+e.getMessage()+"..."+e.getClass());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred is : " + e.getMessage()+"..."+e.getClass());
        }
        System.out.println("result is : "+result);
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }
}
