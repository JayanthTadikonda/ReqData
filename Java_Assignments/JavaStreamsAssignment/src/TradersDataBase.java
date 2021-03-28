import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class TradersDataBase {

    public static void main(String[] args) {

        List<Trader> traders = Arrays.asList(new Trader("Jack","Pune"),
                new Trader("Rebecca","Chennai"),
                new Trader("Kevin","Bangalore"),
                new Trader("Remo","Indore"),
                new Trader("Ahmad","Indore"),
                new Trader("Johnson","Indore"),
                new Trader("Kate","Bangalore"),
                new Trader("Helen","Delhi"),
                new Trader("axel","Pune"));
        //HashMap<Trader,Transaction> traderTransactionHashMap = new HashMap<>();


        List<Transaction> transactions = Arrays.asList(new Transaction(new Trader("alex","Delhi"),2010,200),
                new Transaction(new Trader("Rebecca","Chennai"),2010,500),
                new Transaction(new Trader("Jack","Bangalore"),2011,2000),
                new Transaction(new Trader("Kevin","Chennai"),2011,560),
                new Transaction(new Trader("Salone","Indore"),2015,400));

/*
        Find all traders from Puneand sort them by name.
        traders.stream().filter(trader -> trader.getCity().equalsIgnoreCase("pune"))
                .sorted((n1,n2)->n1.getName().compareToIgnoreCase(n2.getName()))
                .forEach(trader -> System.out.println(trader.getName()));
*/

        //public static Predicate<Trader> distincKeyCity = (city)->city.getCity()
        //traders.stream().distinct().forEach(trader -> System.out.println(trader.getCity()));

        //Are any traders based in Indore?
        //traders.stream().filter(trader -> trader.getCity().equalsIgnoreCase("indore")).forEach(trader -> System.out.println(trader.getName()));

        //Print all transactions’ values from the traders living in Delhi.
//        transactions.stream().filter(transaction-> transaction.getTrader().getCity().equalsIgnoreCase("Delhi"))
//                .forEach(transaction -> System.out.println(transaction.getTrader().getName()));

        //Highest Value of All Transactions
//        transactions.stream()
//                .max((v1,v2)-> Integer.compare(v1.getValue(),v2.getValue()))
//                .stream().forEach(transaction -> System.out.println("Maximum Trade Value: "+transaction.getValue()));

        //Minimum Value
//        transactions.stream()
//                .min((v1,v2)-> Integer.compare(v1.getValue(),v2.getValue()))
//                .stream().forEach(transaction -> System.out.println("Minimum Trade Value: "+transaction.getValue()));


        //Names Sorted Alphabetically
        StringBuilder traderNames = new StringBuilder();
        traders.stream().sorted((n1,n2)->n1.getName().compareToIgnoreCase(n2.getName())).forEach(trader -> traderNames.append(trader.getName()));
        System.out.println(traderNames);
    }
}
