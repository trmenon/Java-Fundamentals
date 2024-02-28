package core;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        if(args.length == 2) {
            System.out.println("Getting cli arguments");
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        // System.out.println("Unary");
        // System.out.println("a incrementing"+ (a++));
        // System.out.println("After incrementing a  = " + a);
        // System.out.println("b decrementing"+ (b++));
        // System.out.println("After decrementing b  = " + b);
        // System.out.println("Logical");
        // System.out.println("a & b = " + (a&b));
        // System.out.println("a || b = " + (a|b));
        // System.out.println("Logical");
        // System.out.println("a < b"+ (a<b));
        // System.out.println("a > b"+ (a>b));
        // String s = "Hello";
        int feb1 = 28;
        int feb2 = 29;
        System.out.println(feb1==29? "Not a leap year": "Leap year");
        System.out.println(feb2==29? "Not a leap year": "Leap year");
    }
}

// Instance operator
// 
