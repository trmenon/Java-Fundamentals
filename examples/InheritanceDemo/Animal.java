package core.examples.InheritanceDemo;

public class Animal {
    private String name;
    public Animal(String n) {
        this.name = n;
    }
    public void eat() {
        System.out.println("Dog is eating");
    } 
    public String getName() {
        return this.name;
    }
}
