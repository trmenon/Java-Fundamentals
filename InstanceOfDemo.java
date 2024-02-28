package core;

class Custom {
    int num;
    Custom(int n) {
        this.num = n;
    }
}

class Person extends Custom {
    String name;
    public Person (int n, String p) {
        super(n);
        this.name = p;
    }
}

public class InstanceOfDemo {
    public static void main(String[] args) {
        String name = "Program";
        Person object = new Person(11, "Java");
        boolean result = name instanceof String;
        boolean res = object instanceof Person;
        System.out.println(name + "belongs to String class:" +(result?"YES": "NO"));
        System.out.println(object + "belongs to String class:" +(res?"YES": "NO"));
    }
}
