package core.examples.bank;

public class Bank extends Account{
    String ifsc_code;
    public Bank(long acc, String name, String ifsc) {
        super(acc, name);
        this.ifsc_code = ifsc;
    }

    public void getIfsc() {
        System.out.println("IFSC:"+this.ifsc_code);
    }
    
}
