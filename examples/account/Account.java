package core.examples.account;

public class Account {
    static float min_balance=1000;
    float currentBalance;
    String account_number;

    public Account( String acc) {
        this.currentBalance = 0;
        this.account_number = acc;
    }

    // Getters
    public void getAccountDetails() {
        System.out.println("Your current balance is " + this.currentBalance);
        if(this.currentBalance<min_balance) {
            System.out.println("Your current balance is lesser than minimum balance");            
        } else {
            System.out.println("You have maintained minimum balance in your account");
        }
    }

    // Setters
    public void setCurrentBalance(float value) {
        this.currentBalance = this.currentBalance+value;
    }
    public static void setMinBalanace(float newMin) {
        min_balance=newMin;
    }

}
