package core;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Switch Case Demo");
        int weekDay;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter weekday number: ");
        weekDay = scn.nextInt();
        scn.close();
        switch(weekDay) {
            case 1: {
                System.out.println("You entered Sunday");
                break;
            }
            case 2: {
                System.out.println("You entered Monday");
                break;
            }
            case 3: {
                System.out.println("You entered Tuesday");
                break;
            }
            case 4: {
                System.out.println("You entered Wednesday");
                break;
            }
            case 5: {
                System.out.println("You entered Thursday");
                break;
            }
            case 6: {
                System.out.println("You entered Friday");
                break;
            }
            case 7: {
                System.out.println("You entered Saturday");
                break;
            }
            default: {
                System.out.println("You entered an incorrect day");
                break;
            }
        }
    }
}

// Syntax
// switch(expression){
//     case value1: {
//         statements
//         break;
//     }
//     case value2: {
//         statements
//         break;
//     }
//     case value3: {
//         statements
//         break;
//     }
//     default: {
//         statements
//         break;
//     }
// }
