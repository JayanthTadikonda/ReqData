import java.util.ArrayList;
import java.util.function.Function;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);

        Function<Integer,String> str = a -> a.toString().concat("TJ");

        for (Integer a: ar) {
            System.out.println(str.apply(a));

        }

    }
}
