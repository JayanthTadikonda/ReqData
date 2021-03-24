import java.util.Scanner;

public class Main {
    static int total_attempts = 3;

    public static void main(String[] args) {
        userLogin();
    }

    public static void userLogin(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Password: ");
        String pass = sc.nextLine();

        if(total_attempts != 0){
            if((name.equals("TJ")) || (pass.equals("abc")) ) {
                System.out.println("Welcome " + name);

            } else{
                System.out.println("Incorrect Login");
                total_attempts--;
                System.out.println(total_attempts +" left !");
                if(total_attempts!=0) {
                    userLogin();
                } else{
                    System.out.println("Contact ADMIN !");
                }

            }
        }
        else {
            System.out.println("Contact Admin");
        }
    }

}
