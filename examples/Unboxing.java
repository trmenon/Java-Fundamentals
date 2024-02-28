package core.examples;

public class Unboxing {
    public static void main(String[] args) {
        Integer object = Integer.valueOf(25);
        Double db = Double.valueOf(3.14);

        // Unboxing
        int a = object.intValue();
        double d = db.doubleValue();

        System.out.println("Integer unboxed:"+ a);
        System.out.println("Double unboxed:"+ d);
    }
}
