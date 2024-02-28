package core.examples;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        int count = 0;
        String vow = "";
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = scn.nextLine();
        scn.close();
        char [] str_array;
        str_array = str.toUpperCase().toCharArray();
        for(char c: str_array) {
            if(c == 'A') {
                count++;
                if(!vow.contains("A")){
                    vow=vow+"A";
                }
            }
            if(c == 'E') {
                count++;
                if(!vow.contains("E")){
                    vow=vow+"E";
                }
            }
            if(c == 'I') {
                count++;
                if(!vow.contains("I")){
                    vow=vow+"I";
                }
            }
            if(c == 'O') {
                count++;
                if(!vow.contains("O")){
                    vow=vow+"O";
                }
            }
            if(c == 'U') {
                count++;
                if(!vow.contains("U")){
                    vow=vow+"U";
                }
            }            
        }
        System.out.println(vow);
        System.out.println(str + " has " + vow.length() + " vowels" + " with occurence of " + count);
    }
}
