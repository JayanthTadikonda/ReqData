import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableEmpl {

    public static void main(String[] args) {

        HashMap<Integer,Employee> ht = new HashMap<>();

        ht.put(1,new Employee("Jack"));
        ht.put(2,new Employee("Rebadaaaaa"));
        ht.put(3,new Employee("Rebacaa"));
        ht.put(4,new Employee("Rebac"));

        for (Map.Entry m: ht.entrySet()) {
            System.out.println(m.getKey()+" " + m.getValue().toString());
        }

        System.out.println("Size: " + ht.size());

    }
}
