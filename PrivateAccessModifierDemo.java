package core;

class Sample {
    private String name;
    public Sample() {
        this.name="NoName";
    }
    public Sample(String n) {
        this.name=n;
    }
    public String getName() {
        return this.name;
    }
}

public class PrivateAccessModifierDemo {
    public static void main(String[] args) {
        Sample object = new Sample("QWERTY");
        System.out.println(object.getName());
    }

}
