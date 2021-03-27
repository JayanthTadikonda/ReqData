import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample2 {

    public static void main(String[] args) {
        printAllStudents();

    }

    public static void printAllStudents(){

        List<Student> li = StudentDatabase.getAllStudents();
        Consumer<Student> c1 = (student)-> System.out.println(student.toString());
        li.forEach(c1);
        Consumer<Student> c2 = (student)-> System.out.print(student.getName());
        li.forEach(c1.andThen(c2));

        li.forEach((student -> {
            if(student.getName().equalsIgnoreCase("jack")){
                System.out.println("FILTER FILTER FILTER");
                c1.accept(student);
            }
        }));
    }
}
