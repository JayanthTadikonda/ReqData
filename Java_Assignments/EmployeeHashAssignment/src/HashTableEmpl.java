import java.util.Hashtable;

public class HashTableEmpl {

    public static void main(String[] args) {

        Hashtable<Integer,Employee> ht = new Hashtable<>();
        Hashtable<Integer,Employee> ht1 = new Hashtable<>();

        ht.put(1,new Employee("Jack"));
        ht1.put(2,new Employee("Reb"));

        System.out.println(ht.hashCode());
        System.out.println(ht.equals(ht1));

        System.out.println(ht1.hashCode());
        System.out.println(ht.get(1).name);
        System.out.println(ht1.get(2).name);

    }
}
