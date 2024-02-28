package core.examples;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Hello World";
        char [] str_array;
        str_array = str.toCharArray();
        for(char c: str_array) {
            System.out.println(c);
        }
    }
}
