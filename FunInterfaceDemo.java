package core;

@FunctionalInterface
interface PiInterface {
    Double getValue();
}

public class FunInterfaceDemo{
    public static void main(String[] args) {
        PiInterface ref;
        ref = ()-> 3.14;
        System.out.println(ref.getValue());
    }
}
