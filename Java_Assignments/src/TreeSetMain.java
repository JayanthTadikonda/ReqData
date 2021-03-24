import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {

        Set<Employee> employees = new TreeSet<Employee>();

        employees.add(new Employee("Jack",60,6));
        employees.add(new Employee("Becca",45,6));
        employees.add(new Employee("Oslo",61,7));

        for (Employee e: employees) {

            System.out.println(e.getName() + " WT: " + e.getWeight() + " HT: " + e.getHeight());
        }


        //Collections.sort(employees, new WeightComparator());
    }
}
