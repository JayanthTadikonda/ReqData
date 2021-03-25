import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MallParkingSystem {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, List<String>>> parking = new HashMap<String, HashMap<String, List<String>>>();

        HashMap<String, List<String>> blocks = new HashMap<>();

        ArrayList<String> slots = new ArrayList<>();

        slots.add("s1");

        blocks.put("block1",slots);
        blocks.put("block2",slots);
        blocks.put("block3",slots);
        blocks.put("block4",slots);

        parking.put("floor1",blocks);
        parking.put("floor2",blocks);
        parking.put("floor3",blocks);




    }




}
