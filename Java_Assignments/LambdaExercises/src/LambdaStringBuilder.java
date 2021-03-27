import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaStringBuilder {

    public static void main(String[] args) {


        StringBuilder newStringAfterAppend = new StringBuilder();
        ArrayList<StringBuilder> strings = new ArrayList<>();

        strings.add(new StringBuilder("Jack"));
        strings.add(new StringBuilder("Salone"));
        strings.add(new StringBuilder("Becca"));
        strings.add(new StringBuilder("Randall"));
        strings.add(new StringBuilder("Joe"));

//        Consumer<ArrayList<StringBuilder>> consumer = (word)-> {
//           word.forEach(word.chartAt());
//        };
        Consumer<StringBuilder> c1 = sentence-> newStringAfterAppend.append((sentence.charAt(0)));
        strings.forEach(stringBuilder -> c1.accept(stringBuilder));
        System.out.println(newStringAfterAppend.toString());

        //newStringAfterAppend.append(consumer.accept(););
        //strings.forEach(s-> s.append(consumer));
        //newStringAfterAppend.append(consumer);
        //System.out.println(newStringAfterAppend);
        //strings.forEach((s-> s.append(consumer)));
        //strings.forEach(s-> System.out.println(strings));

    }
}
