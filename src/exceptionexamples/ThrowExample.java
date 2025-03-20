package exceptionexamples;

public class ThrowExample {
    public static void sample(){
        int a =10;
        if(a==10){
            throw new RuntimeException("a is 10 and some RuntimeException occurred");
        }
        System.out.println("a value is : "+a);
    }
    public static void main(String[] args) {
        try{
            ThrowExample.sample();
        }catch(Exception e){
            System.out.println("Exception occurred is : "+e.getMessage());
        }
    }
}
