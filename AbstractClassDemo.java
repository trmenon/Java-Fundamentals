package core;

abstract class AbstractClass {
    public void display(){
        System.out.println("Java Programming");
    }
}
public class AbstractClassDemo extends AbstractClass{
    public static void main(String[] args) {
        AbstractClassDemo obj = new AbstractClassDemo();
        obj.display();
    }
}
