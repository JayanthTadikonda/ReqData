public class Current extends Bank{

    private double balance;
    private int creditCard;

    public Current(String accountType, double bankAmount, int accountNumber, double balance, int creditCard) {
        super(accountType, bankAmount, accountNumber);
        this.balance = balance;
        this.creditCard = creditCard;
    }

    public double currentBalance(){
        return this.balance - this.creditCard;
    }

    @Override
    public double bankBalance() {
        return  super.bankBalance() - currentBalance();
    }
}
