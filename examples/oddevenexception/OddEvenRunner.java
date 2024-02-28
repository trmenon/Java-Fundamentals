package core.examples.oddevenexception;

class NumberClass{

    
    public boolean isOdd(int num) {
        try{
            if(num%2 == 0) {
                throw new IllegalArgumentException("Invalid odd number");
            }else {
                return true;
            }
        }catch(IllegalArgumentException exp) {
            System.out.println(exp.getMessage());
            return false;
        }
        
    }
}

public class OddEvenRunner {
    public static void main(String[] args) throws Exception{
        NumberClass obj = new NumberClass();
        boolean b = obj.isOdd(6);
        System.out.println(b);
        b=obj.isOdd(7);
        System.out.println(b);
    }
}
