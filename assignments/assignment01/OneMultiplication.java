package core.assignments.assignment01;

import java.util.Scanner;
// Write a Java program that takes a number as input and prints its multiplication table up to 10.

public class OneMultiplication {
    public static void main(String[] args) {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number to generate multiplication table: ");
        num = scn.nextInt();
        scn.close();
        int iterator = 1;
        while(iterator<=10) {
            System.out.println(iterator + " * " + num + " = " + (iterator*num));
            iterator++;
        }
    }
}
