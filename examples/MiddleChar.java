package core.examples;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = scn.nextLine();
        scn.close();
        int mid_index = str.length()/2;
        System.out.println("Middle characters");
        
        if(str.length()%2 == 0) {
            System.out.print(str.charAt(mid_index-1));
            System.out.print(str.charAt(mid_index));
        }else {
            System.out.print(str.charAt(mid_index));
        }
    }
}
