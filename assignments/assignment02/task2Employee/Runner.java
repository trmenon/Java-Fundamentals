package core.assignments.assignment02.task2Employee;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Manager man = new Manager(
            "DB001ERD", 
            2142,
            "John Castiel",
            "Boulevard Lane",
            "South Zone",
            "New Delhi",
            "India",
            365000.0,
            "Project Manager"
        );
        Developer dev = new Developer(
            "DB001ERD", 
            2143,
            "Alice Brown",
            "Boulevard Lane",
            "South Zone",
            "New Delhi",
            "India",
            245000.0,
            "Lead Developer"
        );
        Programmer pro = new Programmer(
            "DB001ERD", 
            2145,
            "Wayne Brent",
            "Boulevard Lane",
            "South Zone",
            "New Delhi",
            "India",
            135000.0,
            "Associate Programmer"
        );
        System.out.println("Reading monthly performance credits");
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i<12; i++) {            
            System.out.print("Credit for month "+ (i+1) + ":");
            int current = scn.nextInt();
            man.setCreditForMonth(i, current);
            dev.setCreditForMonth(i, current);
            pro.setCreditForMonth(i, current);
        }
        scn.close();
        System.out.println("##############Displaying team information##############");
        man.displayManagerDetails();
        dev.displayDeveloperDetails();
        pro.displayProgrammerDetails();
    }
}
