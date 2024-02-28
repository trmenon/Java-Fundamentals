package core;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0; //Initialization
        while(i<10) { //Condition checking
            System.out.println("Current value is " + i); //Block of iterative scope statements
            i++; // Iterator control
        }
        System.out.println("Itertive block terminated and current state of iterator is " + i);
    }
}
