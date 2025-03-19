package exceptionexamples;

public class NullPointerExample {
    public static void main(String[] args) {
        try{
            String msg1="hi hello";
            String msg2=null;
            System.out.println("length of msg1 is : "+msg1.length());
            System.out.println("length of msg2 is : "+msg2.length());
        }catch (NullPointerException e){
            System.out.println("Exception occurred : "+e.getMessage());
        }
    }
}
