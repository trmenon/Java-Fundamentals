package core;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;
        int tag = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = scn.nextInt();
        System.out.println("Enter second number: ");
        b = scn.nextInt();
        System.out.println("Enter second number: ");
        c = scn.nextInt();
        scn.close();

        if(a>b) {
            if(a>c) {
                tag =1;
            }else {
                tag = 3;
            } 
        }else {
            if(b>c) {
                tag =2;
            }else {
                tag = 3;
            }
        }
        if(tag> 0) {
            System.out.println("Greatest is value number " + tag);
        }
        
    }
}
