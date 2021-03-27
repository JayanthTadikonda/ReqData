import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapStringAppend {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Jack");
        map.put(34,"barack");
        map.put(99,"car");
        map.put(7,"den");
        map.put(5,"enk");
        map.put(3,"foral");

        StringBuilder s = new StringBuilder();

        Consumer<StringBuilder> consumer = (mapValues)-> mapValues.append(map.entrySet());
        //map.forEach((a,b)-> System.out.println(consumer);


        System.out.println(map.entrySet());
        map.forEach((a,b)->s.append(a).append(b));
        System.out.println(s.toString());
    }
}
