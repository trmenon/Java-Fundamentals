// Write a Java program that reads a floating-point number 
// and prints "zero" if the number is zero. 
// Otherwise, print "positive" or "negative". 
// Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

package core.assignments.assignment01;
import java.util.Scanner;

public class ThreeFloatingPointNumberStatus {
    public static void main(String[] args) {
        double num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number to check status: ");
        num = scn.nextDouble();
        scn.close();
        if(num == 0) {
            System.out.println("You have entered 0");
        } else {
            // Checking positive status
            System.out.println("Number you have entered is " + (num<0? "Negative": "Positive"));
            // Checking size status
            double abs_num = num<0? num*-1: num;
            if(abs_num<1 || abs_num> 1000000) {
                System.out.println("Number you have entered is " + (abs_num<1? "Small": "Large"));
            }            
        }
    }
}
