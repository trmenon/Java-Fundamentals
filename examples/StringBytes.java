package core.examples;

public class StringBytes {
    public static void main(String[] args) {
        String str = "Hello World!!!";
        System.out.println(str.getBytes().getClass());
        System.out.println(str.getBytes());
    }
}
