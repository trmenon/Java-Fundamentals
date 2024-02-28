package core.examples;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int num, sum=0;
        int i =1;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter limit:");
        num = scn.nextInt();
        scn.close(); 
        do{
            if(i%2 == 0) {
                sum += i;
            }
            i++;
        }while(i<=num);
        System.out.println("Sum is " + sum);
    }
    
    
}
