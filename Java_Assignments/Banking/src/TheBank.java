public class TheBank {

    public static void main(String[] args) {

        Bank b = new Bank("savings",5000,1234);
        Bank b2 = new Savings("savings", 10000, 345,450,1500);
        Current c1 = new Current("current",2000, 444,4000,3500);

        System.out.println("TOTAL BANK AMOUNT: "+ (b.bankBalance() + b2.bankBalance() + c1.bankBalance()) );
    }
}
