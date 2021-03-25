import java.util.TreeSet;

public class BankAccountList {

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(123, 5000, "Jack", false);
        SavingsAccount s2 = new SavingsAccount(333, 3000, "Rebecca", false);
        SavingsAccount s3 = new SavingsAccount(222, 50000, "Kate", false);
        SavingsAccount s4 = new SavingsAccount(111, 30070, "Kevin", true);

        TreeSet<SavingsAccount> accountsList = new TreeSet<>();

        //accountsList.add(new SavingsAccount(122, 45.0, "dfg",false));
        accountsList.add(s2);
        accountsList.add(s3);
        accountsList.add(s4);

        for (SavingsAccount s: accountsList) {
            System.out.println(s.toString());
        }

        System.out.println(s1.getAccBalance());



    }
}
