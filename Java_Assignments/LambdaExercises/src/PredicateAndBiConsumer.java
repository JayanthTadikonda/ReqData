import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumer {
    //static List<Student> list = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("abcd");
        words.add("abcde");
        words.add("abcdee");
        words.add("abcdwqq");
        words.add("abcdqweqweqweq");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(33);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);

        Runnable runlambda = ()-> {
            System.out.println(numbers);
        };
        new Thread(()-> System.out.println(numbers)).start();



        //list.removeIf(student -> student.getName().length()%2!=0);
        words.forEach(System.out::println);
        words.removeIf(word -> word.length()%2!=0);
        System.out.println("After removing ODD length Words");
        words.forEach(System.out::println);

        words.replaceAll(word-> word.toUpperCase());
        System.out.println("Upper Case");

        words.forEach(System.out::println);



//        Predicate<Student> name = (student)-> student.getName().length()%2!=0;
//
//        Consumer<Student> printNames = (student)-> System.out.println(student.getName());
//
//        Consumer<Student> removeName = (student)-> list.remove(student);
//
//        Consumer<Student> validate = (student -> {
//            if(name.test(student)){
//                //printNames.accept(student);
//                removeName.accept(student);
//            }
//            System.out.println(list);
//        });

        //list.forEach(validate);


    }
}
