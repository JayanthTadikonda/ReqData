import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListReverse {
    public static void main(String[] args) {

        ArrayList<String > li = new ArrayList<>();
        li.add("Jack");
        li.add("Rebeca");
        li.add("Randall");
        li.add("Kevin");
        li.add("Kate");
        ListIterator<String> it = li.listIterator();

        while (it.hasNext()){
            it.next();
        }
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
