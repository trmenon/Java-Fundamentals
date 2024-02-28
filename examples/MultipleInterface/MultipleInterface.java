package core.examples.MultipleInterface;

interface Cat {
    public void meow ();
}
interface Dog {
    public void bark ();
}

class Animal implements Cat,Dog{
    public void meow() {
        System.out.println("Meow");
    }
    public void bark() {
        System.out.println("bark");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.meow();
        obj.bark();
    }
}
