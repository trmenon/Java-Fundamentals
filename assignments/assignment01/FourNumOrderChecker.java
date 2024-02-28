// Write a program that accepts three numbers 
// from the user and prints 
// "increasing" if the numbers are in increasing order, 
// "decreasing" if the numbers are in decreasing order, 
// and "Neither increasing or decreasing order" otherwise.

package core.assignments.assignment01;
import java.util.Scanner;

public class FourNumOrderChecker {
    public static void main(String[] args) {
        int num1,num2,num3,status=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        num2 = scn.nextInt();
        System.out.print("Enter third number: ");
        num3 = scn.nextInt();
        scn.close();

        if(num1<= num2 && num2<=num3) {
            status=1;
        }
        if(num1>= num2 && num2>=num3) {
            status=-1;
        }

        if(status == 0) {
            System.out.println("Neither increasing or decreasing order");
        }
        if(status == 1) {
            System.out.println("Increasing order");
        }
        if(status == -1) {
            System.out.println("Decreasing order");
        }
    }
}
