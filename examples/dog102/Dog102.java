package core.examples.dog102;

class Dog {
    String name;
    String breed;

    public Dog() {
        this.name = "Unknown dog";
        this.breed = "Unknown breed";
    }

    public Dog(String name) {
        this.name = name;
        this.breed = "Unknown breed";
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName () {
        return this.name;
    }
    public String getBreed () {
        return this.breed;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Dog102 {
    public static void main(String[] args) {
        Dog d = new Dog("Rocky", "Golden Retriver");
        System.out.println("Details of dog");
        System.out.println("Name: "+ d.getName());
        System.out.println("Breed: "+ d.getBreed());
        d.setName("Pollo");
        d.setBreed("Labrador");
        System.out.println("After changing details of dog");
        System.out.println("Details of dog");
        System.out.println("Name: "+ d.getName());
        System.out.println("Breed: "+ d.getBreed());
    }
}
