package core.examples.mulsum;

public class Operation {
    
    public void makeSum() {
        Values v = new Values();
        System.out.println("Sum is " + (v.num1+v.num2));
    }
    public void makeProd(int x, int y) {
        System.out.println("Product is " + (x*y));
    }
}
