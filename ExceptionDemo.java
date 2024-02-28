package core;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int d = 100/0;
            System.out.println(d);
        }catch(ArithmeticException exp) {
            System.out.println("Unexpected error occured");
            System.out.println(exp.getMessage() + " is not supported");
        }
    }
}
