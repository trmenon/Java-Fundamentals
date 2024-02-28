package core.examples.StringRev;

public class StringRev {
    static String getRev(String str) {
        if(str.isEmpty() || str.length()==1) {
            return str;
        } else {
            int last = str.length()-1;
            return (str.charAt(last)+getRev(str.substring(0, last)));
        }
    }

    public static void main(String[] args) {
        System.out.println(getRev("Terp"));
    }
}
