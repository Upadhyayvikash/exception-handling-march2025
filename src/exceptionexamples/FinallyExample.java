package exceptionexamples;

public class FinallyExample {
    public static void main(String[] args) {
        int a=10,b=10;
        int result=0;
        try{
            result=a/b;
            System.out.println("ending try block");
        }catch(Exception e){
            System.out.println("Exception occurred is : "+e.getMessage());
        }
        finally {
            System.out.println("finally will always execute");
        }
    }
}
