import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Role (Owner/Customer): ");
        String role = sc.nextLine();
        List<Dessert> storage = new ArrayList<>();
        List<Dessert> cart = new ArrayList<>();
        double cartValue = 0.0;
        int value = 0;
        int value2 = 0;

        if(role.equalsIgnoreCase("owner")) {

            while (value != 4) {
                System.out.println("1. Candy 2. Cookie 3. IceCream 4. Exit");
                value = sc.nextInt();


                switch (value) {

                    case 1:
                        Dessert candy = new Candy(2, 0.5);
                        storage.add(candy);
                        System.out.println("Candy added to storage!");
                        break;

                    case 2:
                        Dessert cookie = new Cookie(3, 1);
                        storage.add(cookie);
                        System.out.println("Cookie added to storage!");
                        break;

                    case 3:
                        Dessert icecream = new IceCream(5, 1.50);
                        storage.add(icecream);
                        System.out.println("IceCream added to storage!");
                        break;

                    case 4:
                        System.out.println("SHOP Exited.");
                        break;

                }
            }
            for (Dessert b : storage) {
                if (b instanceof Cookie) {
                    System.out.println("Cookie Price:" + b.getPrice());
                } else if (b instanceof Candy) {
                    System.out.println("Candie Price: " + b.getPrice());
                } else if (b instanceof IceCream) {
                    System.out.println("IceCream Price:" + b.getPrice());
                }
            }
        }
        else if(role.equalsIgnoreCase("customer")){

            while (value2 !=4){
                System.out.println("1. Candy 2. Cookie 3. IceCream 4. Exit");
                value2 = sc.nextInt();
                switch (value2){

                    case 1:
                        Dessert candy = new Candy(2, 0.5);
                        cart.add(candy);
                        System.out.println("Candy added to cart!");
                        break;

                    case 2:
                        Dessert cookie = new Cookie(3, 1);
                        cart.add(cookie);
                        System.out.println("Cookie added to cart!");
                        break;

                    case 3:
                        Dessert icecream = new IceCream(5, 1.50);
                        cart.add(icecream);
                        System.out.println("IceCream added to cart!");
                        break;

                    case 4:
                        System.out.println("SHOP Exited.");

                }
            }
            for (Dessert a : cart) {
                System.out.println("Price: "+a.getPrice());
                cartValue += a.getCost();

            }
            System.out.println("Bill Amt: " + cartValue + "\n *Tax included*");
        }
    }
}

