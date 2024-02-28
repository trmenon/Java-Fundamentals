package core.examples.InheritanceDemo;

public class Dog extends Animal{
    public Dog(String t) {
        super(t);
    }
    public void display() {
        System.out.println("Name is " + this.getName());
        this.eat();
    }
}
