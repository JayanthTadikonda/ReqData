import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkedCarOwnerList {

    // ArrayList<ParkedCarOwnerDetails> cars = new ArrayList<>();
    HashMap<Integer, ParkedCarOwnerDetails> carsParked = new HashMap<>();


    public void addNewCar(ParkedCarOwnerDetails car, int token) {
        carsParked.put(token, car);
    }

    public void removeCar(int token) {

        for (Map.Entry m : carsParked.entrySet()) {
            if (m.getKey().equals(token)) {
                carsParked.remove(token);
                System.out.println("Car with token" + token + " removed");
            } else
                System.out.println("Car not present");
        }

    }

    public void getParkedCarLocation(int token) {
        boolean flag = false;
        ParkedCarOwnerDetails c = new ParkedCarOwnerDetails();
        for (Map.Entry m : carsParked.entrySet()) {
            if (m.getKey().equals(token)) {
                flag = true;
                c = carsParked.get(m.getKey());
                break;
            } else
                System.out.println("Car not present");

        }
        if(flag)
            System.out.println("Car Found at: \n" + c.toString());
    }
}
