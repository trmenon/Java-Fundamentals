package core;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int a =5;
        double b = 4.2;
        Integer obj = Integer.valueOf(a);
        System.out.println(obj instanceof Integer);
        Double obj_db = Double.valueOf(b);
        System.out.println(obj_db instanceof Double);
    }
}
