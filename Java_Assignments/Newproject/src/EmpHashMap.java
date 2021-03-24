import java.util.HashMap;
import java.util.Map;

public class EmpHashMap {

    public static void main(String[] args) {

        HashMap<DateOfBirth, EmpName> employee1 = new HashMap<>();

        employee1.put(new DateOfBirth(12,12,2008), new EmpName("Jack"));
        employee1.put(new DateOfBirth(12,12,2009), new EmpName("Kate"));
        employee1.put(new DateOfBirth(13,9,2014), new EmpName("Randall"));

        System.out.println(employee1.keySet());

        for (Map.Entry<DateOfBirth, EmpName> m: employee1.entrySet()) {

            DateOfBirth dob = m.getKey();
            EmpName name = m.getValue();
            System.out.println("Employee DOB: " + m.getKey().getDay() + " Name: " + m.getValue().getName());

            if(dob.getDay() == dob.getMonth()){
                System.out.println("Same month and Day");
            }

        }

    }
}
