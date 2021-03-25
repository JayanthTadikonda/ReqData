import java.util.Comparator;

public class SavingsAccount implements Comparable<SavingsAccount> {

    private  int accId;
    private double accBalance;
    private String accHolderName;
    private boolean isSalaryAccount;

    public SavingsAccount(int accId, double accBalance, String accHolderName, boolean isSalaryAccount) {
        this.accId = accId;
        this.accBalance = accBalance;
        this.accHolderName = accHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }

    public void depositMoney(double amount){
        this.accBalance += amount;
        System.out.println("Total Balance available: " + accBalance);
    }

    public void withdrawMoney(double amount){
        if(accBalance > 0)
            this.accBalance -= amount;
        else
            System.out.println("Insufficient Balance !");

    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accId=" + accId +
                ", accBalance=" + accBalance +
                ", accHolderName='" + accHolderName + '\'' +
                ", isSalaryAccount=" + isSalaryAccount +
                '}';
    }


    @Override
    public int compareTo(SavingsAccount o) {
        if(this.accId>o.accId){
            return 1;
        }else if(this.accId<o.accId){
            return -1;
        }else{
            return 0;
        }
    }
}
