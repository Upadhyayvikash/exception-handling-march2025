package exceptionexamples;

public class ThrowsExample{
    public static void sample() throws InterruptedException,  IllegalAccessException{
        int a=20;
        if(a==10){
            throw new ArithmeticException("a value is 10 and it is unchecked exception");
        }
        if(a==20){
            throw new InterruptedException("a value is 20 and it is checked exception");
        }
        if(a==30){
            throw new NullPointerException("a value is 30 and it is unchecked exception");
        }
        if(a==40){
            throw new IllegalAccessException("a value is 40 and it is checked exception");
        }

    }
    public static void main(String[] args) {
        try{
            ThrowsExample.sample();
        }catch (Exception e){
            System.out.println("Exception occurred is : "+e.getMessage()+"....."+e.getClass());
        }
    }
}
