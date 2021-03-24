import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> li = new LinkedHashSet<>();

        li.add("Beccs");
        li.add("Jack");
        li.add("cloey");
        li.add("Randall");
        li.add("amy");

        Iterator<String > it = li.iterator();

        while (it.hasNext()){
        }
    }
}
