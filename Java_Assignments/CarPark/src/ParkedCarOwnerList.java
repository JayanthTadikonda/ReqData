import java.util.ArrayList;
import java.util.Collections;

public class ParkedCarOwnerList {

    ArrayList<ParkedCarOwnerDetails> cars = new ArrayList<>();


    public void addNewCar(ParkedCarOwnerDetails car){
        cars.add(car);
    }

    public void removeCar(String name){

        for (ParkedCarOwnerDetails m:cars) {
            if(m.getCarModel().equalsIgnoreCase(name)){
                int index = m.getCarModel().indexOf(name);
                cars.remove(index);
            } else
                System.out.println("Car Removed");
        }

    }

    public void getParkedCarLocation(String name){

        for (ParkedCarOwnerDetails d:cars) {
            if(d.getOwnerName().equalsIgnoreCase(name)){
                int index = d.getOwnerName().indexOf(name);
                System.out.println(d.toString()+ "Parked at " + index + "Position: ");
            } else
                System.out.println("Car not Parked.");
            break;
        }
    }
}
