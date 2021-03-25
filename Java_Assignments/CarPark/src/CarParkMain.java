import java.util.ArrayList;

public class CarParkMain {

    public static void main(String[] args) {

        ParkedCarOwnerList list = new ParkedCarOwnerList();

        list.addNewCar(new ParkedCarOwnerDetails("Jack","GT",123,12234,"the avenue"));
        list.addNewCar(new ParkedCarOwnerDetails("reb","cayman",122,12234,"the avenue 567"));
        list.addNewCar(new ParkedCarOwnerDetails("kev","911",1,12234,"the avenue 122"));

        list.getParkedCarLocation("jack");
    }
}
