import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        BiConsumer<String,Integer> bi = (a,b)-> System.out.println(a+" 9HARD "+ b);
        bi.accept("TJ",999);

        Predicate<Integer> p = (a)-> a%2==0;
        System.out.println(p.test(4));


    }
}
