package core.examples.ExceptionHandlingDemo;

import java.io.IOException;

class Test{
    int [] array = new int [10];

    public void setList(int num, int div, int index) {
        try{
            int res = num/div;
            array[index] = res;
            System.out.println("Operation acheived");
        }catch(IndexOutOfBoundsException exp) {
            System.out.println("Index out of bounds");
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
        }catch(ArithmeticException exp) {
            System.out.println("Unable to perform exception");
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
        }
    } 
}

public class ExceptionHandlingDemo  {
    public static void main(String[] args) throws IOException{
        Test abc = new Test();
        abc.setList(11,5,10);
        abc.setList(12,0,9);        
        abc.setList(13,7,8);        
    }
}
