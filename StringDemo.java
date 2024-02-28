package core;

public class StringDemo {
    public static void main(String[] args) {
        // String str = "Hello World. Welcome to java programming";
        // System.out.println(str.getBytes());
        // System.out.println("Length : " + str.length());
        // System.out.println("Concatenated : " + str.concat(". We are seeing strings."));
        // System.out.println("Length : " + str.equals("Hello World. Welcome to java programming"));
        // System.out.println("W first occurence : " + str.indexOf("W"));
        // str = "test";
        // System.out.println(str);
        // System.out.println(str.getBytes());
        String str1 = "Hello World. Welcome to java programming.";
        // String str3 = "Hello World. Welcome to java programming";
        String str2 = "Welcome to java programming.Hello World";
        // System.out.println(str1==str2);
        // System.out.println(str1.hashCode());
        // System.out.println(str2.hashCode());        
        System.out.println(str2.compareTo(str1));        
        str1 = "new Test";
        // System.out.println(str1.hashCode());
        // System.out.println(str2.getBytes());
    }
}