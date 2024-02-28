package core;

class Animal {

}

public class CatMain extends Animal{
    String name;
    CatMain() {
        super();
        this.name = "Cat";
    }
    public void sound() {
        System.out.println("Cat makes Meow sound");
    }
    
}
