package core.assignments.assignment01;
import java.util.Scanner;
// Write a Java program to convert an integer number to a binary number.
public class TwoNumBinaryConertor {

    public static void main(String[] args) {
        int num, pow, temp;
        int binary_num=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number to convert number to binary: ");
        num = scn.nextInt();
        scn.close();
        int i = 1;
        
        while(num>0) {            
            temp = num%2;
            pow=1;
            for(int j=0;j<i;j++) {
                pow*=10;
            }
            binary_num = (temp*pow)+binary_num;
            num = num/2;
            i++;
        }
        binary_num/=10;
        System.out.println("Binary equivalent is " + binary_num);
    }
}


// 6-> 0
// 3-> 1
// 1

// 7-> 1
// 3-> 1
// 1