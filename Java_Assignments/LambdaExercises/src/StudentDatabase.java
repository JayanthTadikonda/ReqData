import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getAllStudents(){
        List<Student> students = (List<Student>) Arrays.asList(new Student(1, "Jack"),
                new Student(2,"Rebecca"),
                new Student(3,"kate"),
                new Student(4,"Randall"));

        return students;
    }
}
