package core.examples.encapsulationdemo;

class Person {
    private String name;
    private String place;
    private String country;

    public Person () {
        this.name = "No Name";
        this.place = "No Place";
        this.country = "No Country";
    }

    // Setters
    public void setName (String name) {
        this.name = name;
    }
    public void setCountry (String country) {
        this.country = country;
    }
    public void setPlace (String place) {
        this.place = place;
    }

    // Getters
    public void getDetails () {
        System.out.println("Details...");
        System.out.println("Name: " + this.name);
        System.out.println("Place: " + this.place);
        System.out.println("Country: " + this.country);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Current details of person");
        p.getDetails();
        System.out.println("Changing details");
        p.setName("Alex");
        p.setPlace("Tokyo");
        p.setName("Japan");
        System.out.println("After changing...");
        p.getDetails();
    }
}
