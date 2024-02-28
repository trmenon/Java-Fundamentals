package core;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        int a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = scn.nextInt();
        System.out.println("Enter second number: ");
        b = scn.nextInt();
        scn.close();
        System.out.println("First Value is " + a);
        System.out.println("Second Value is " + b);
    }
}


// Scanner class to read input from user
// Initializing scanner
    // Scanner <scanner_name> = new Scanner(System.in);
// Getting values
    // <Variable_Name> = <Scanner_Name>.nextInt();
    // <Variable_Name> = <Scanner_Name>.nextDouble();
    // <Variable_Name> = <Scanner_Name>.nextFloat();
    // <Variable_Name> = <Scanner_Name>.nextLine();
// Close the scanner and free scanner
    // <Scanner_Name>.close();