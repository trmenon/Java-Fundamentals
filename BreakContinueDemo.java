package core;

import java.util.Scanner;

public class BreakContinueDemo {
    public static void main(String[] args) {
        int ch, i = 10;
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 0 to break 1 to continue");
        ch = scn.nextInt();
        scn.close();
        if(ch == 0) {
            for(int p=0; p<i; p++) {
                if(p==5) {
                    break;
                }
                System.out.println("Current value is " + p);
            }
        }
        if(ch == 1) {
            for(int p=0; p<i; p++) {
                if(p==5) {
                    continue;
                }
                System.out.println("Current value is " + p);
            }
        }
        if(ch != 1 && ch != 0) {
            System.out.println("Invalid choice");
        }
    }
}
