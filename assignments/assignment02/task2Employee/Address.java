package core.assignments.assignment02.task2Employee;

public class Address {
    int mapping_key;
    String addLine1;
    String addLine2;
    String city;
    String country;

    public Address(
        int mappingKey,
        String addLine1,
        String addLine2,
        String city,
        String country
    ) {
        this.mapping_key = mappingKey;
        this.addLine1 = addLine1;
        this.addLine2 = addLine2;
        this.city = city;
        this.country = country;
    }

    public void displayAddress() {
        System.out.println("Address:");
        System.out.println(this.addLine1);
        System.out.println(this.addLine2);
        System.out.println(this.city + "," + this.country);
    }
}
