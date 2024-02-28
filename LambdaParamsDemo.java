package core;

@FunctionalInterface
interface MyParamterInterface {
    String reverse(String value);
}

public class LambdaParamsDemo {
    public static void main(String[] args) {
        MyParamterInterface ref;
        ref = (value)-> {
            int length = value.length();
            String rev_str="";
            for(int i = length-1; i>=0; i--) {
                rev_str+=value.charAt(i);
            }
            return rev_str;
        };
        System.out.println(ref.reverse("Java"));
    }
}
