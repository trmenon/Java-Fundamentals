package core;

public class MethodOverloadingDemo {
    public int operation (int x) {
        return (x*x);
    }
    public int operation (int x, int y) {
        return (x*y);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo object = new MethodOverloadingDemo();
        System.out.println("Square is " + object.operation(12));
        System.out.println("Product is " + object.operation(12, 13));
    }
}
