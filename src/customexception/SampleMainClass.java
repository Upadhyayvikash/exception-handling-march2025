package customexception;

public class SampleMainClass {
    public static void main(String[] args) {
        try {
            int a = 100;
            if (a == 100) {
                throw new UserErrorException("a is 100 and this is our user defined exception");
            }
        }catch(Exception e){
            System.out.println("Exception occurred is : "+e.getMessage()+"....."+e.getClass());
        }
        }
    }
