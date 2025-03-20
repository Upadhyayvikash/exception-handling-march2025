package exceptionexamples;

public class NestedTryAndCatchExamples {
    public static void main(String[] args) {
        //monitor code
        try{
            System.out.println("inside the 1st try block");
            int a = 10, b = 10, result = 0;
            result = a / b; //divided by zero
            System.out.println("result is : "+result);
            try{
                        System.out.println("inside the 2nd try block");
                        String msg1 = "hi hello";
                        String msg2 = "hello";
                        System.out.println("length of msg1 is : " + msg1.length());
                        System.out.println("length of msg2 is : " + msg2.length());
                try{
                            System.out.println("inside the 3rd try block");
                    int arr[] = {23, 12, 4, 35};
                    System.out.println("length of arr is : " + arr.length);
                    System.out.println("value of arr[0] is : " + arr[0]);
                    System.out.println("value of arr[6] is : " + arr[6]);

                }catch(Exception e){
                            System.out.println("inside the 3rd catch block");
                            System.out.println("Exception occurred is : "+e.getMessage());

                }
            }catch(Exception e){
                        System.out.println("inside the 2nd catch block");
                        System.out.println("Exception occurred is : "+e.getMessage());

            }
        }catch(Exception e){
                System.out.println("inside the 1st catch block");
                System.out.println("Exception occurred is : "+e.getMessage());

        }
    }
}
