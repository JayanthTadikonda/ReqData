public class Savings extends Bank{

    private double balance;
    private double fd;

    public Savings(String accountType, double bankAmount, int accountNumber, double balance, double fd) {
        super(accountType, bankAmount, accountNumber);
        this.balance = balance;
        this.fd = fd;
    }

    public double savingBalance(){
        return this.balance+this.fd;
    }

    @Override
    public double bankBalance() {
        return savingBalance()+ super.bankBalance();
    }
}
