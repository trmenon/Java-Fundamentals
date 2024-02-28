package core.examples;

public class square {
    public static int getSquare(int x) {
        return (x*x);
    }

    public static void main(String[] args) {
        for(int i=0; i<25; i++) {
            System.out.println(i + ":" + getSquare(i));
        }
    }
}
