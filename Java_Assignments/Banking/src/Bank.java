public class Bank {

    private String accountType;
    private double bankAmount;
    private int accountNumber;

    public Bank(String accountType, double bankAmount, int accountNumber) {
        this.accountType = accountType;
        this.bankAmount = bankAmount;
        this.accountNumber = accountNumber;
    }

    public void bankInformation(){
        System.out.println("Welcome to my Banks LTD.");
    }

    public double bankBalance(){
        return bankAmount;
    }
}
