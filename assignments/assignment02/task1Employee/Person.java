package core.assignments.assignment02.task1Employee;


public class Person {
    String firstName;
    String lastName;

    public Person (String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
