import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("becca");
        hs.add("jack");
        hs.add("randall");

        Iterator<String> hi = hs.iterator();

        while (hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}
