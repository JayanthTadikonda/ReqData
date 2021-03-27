
import java.util.*;

public class LambdaExerciseComparator {
    public static void main(String[] args) {

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        };
//
//        System.out.println("Comparing two INTEGERS : " + comparator.compare(9,5));
//
//        Comparator<String> lambdaComparator = (a,b)-> a.compareTo(b);
//        System.out.println("Testing String comaparator using lambda: " + lambdaComparator.compare("a","a"));
//
//        Comparator<Integer> comparator1 = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        System.out.println("Comparing two integers: " + comparator1.compare(1,2));
//
//        Comparator<Integer> comparator2Lambda = (a,b)-> a.compareTo(b);
//
//        System.out.println("Integer Comparision: " + comparator2Lambda.compare(1,1));

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(76);
        list.add(6);
        list.add(55);
        list.add(42);
        Collections.sort(list);

        List<NamesOfPeople> nameList = Arrays.asList(new NamesOfPeople("zack"),
                new NamesOfPeople("Rebecca"),
                new NamesOfPeople("Kevin"));

//        Comparator<NamesOfPeople> nameComparator = new Comparator<NamesOfPeople>() {
//            @Override
//            public int compare(NamesOfPeople o1, NamesOfPeople o2) {
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }
//        };
        //nameList.sort(nameComparator);

        Comparator<NamesOfPeople> namesOfPeopleComparator = (a,b) -> a.getName().compareToIgnoreCase(b.getName());
        //nameList.sort(namesOfPeopleComparator);
        System.out.println(" List Elements: " + nameList.toString());

        nameList.sort((a,b)->a.getName().compareToIgnoreCase(b.getName()));
        System.out.println("Sorting List Elements: " + nameList.toString());





    }
}
