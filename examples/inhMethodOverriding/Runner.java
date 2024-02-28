package core.examples.inhMethodOverriding;
class Animal{
    public void eat() {
        System.out.println("Animals eat food");
    }
    public void noise() {
        System.out.println("Animals make sound");
    }
}
class Cat extends Animal{
    public void eat() {
        super.eat();
        System.out.println("eating cat food and fishes");
    }
}
public class Runner {
    public static void main(String[] args) {
        Cat c = new Cat();
        Animal a = new Animal();
        c.eat();
        c.noise();
    }
}
