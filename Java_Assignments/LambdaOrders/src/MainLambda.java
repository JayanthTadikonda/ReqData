import java.util.Arrays;
import java.util.List;

public class MainLambda{
    public static void main(String[] args) {

        List<Orders> orders = Arrays.asList(
                new Orders(10000, "accepted"),
                new Orders(2020, "completed"),
                new Orders(15000, "completed"),
                new Orders(100, "accepted"));

        interfaceLambda l = a -> a.getOrderSize()> 2000;

        orders.forEach( b -> {

            if(l.testing(b))
            System.out.println(b.toString());
        });

        interfaceLambda status = s -> s.getOrderStatus().equalsIgnoreCase("accepted");

        orders.forEach(o -> {
            if(status.testing(o))
                System.out.println("\n"+o.toString());
        });


    }

}
