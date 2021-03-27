import java.util.*;
import java.util.stream.Collectors;

public class AssignmentMainClass {
    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(new Fruit("Kiwi",45,25,"Green"),
                new Fruit("Apple",33,3,"Red"),
                new Fruit("Pineapple",22,66,"Cream"),
                new Fruit("MuskMelon",180,90,"CreamWhite"),
                new Fruit("DragonFruit",500,55,"CrimsonRed"),
                new Fruit("Strawberry",5,60,"Red"),
                new Fruit("Gua",32,1,"Green"));



        //Comparator<Fruit> calories = (a,b)-> a.getCalories();
        //.sorted((p1,p2)->p1.getName().compareToIgnoreCase(p2.getName()))
        //.sorted((f1,f2)-> f1.getColor().compareToIgnoreCase(f2.getColor()))
        //.map(m-> m.getColor().compareToIgnoreCase("Red"));
        //.forEach((fruit -> System.out.println();
        //Display  the  fruit  names  of  low  caloriesfruits  i.e.  calories  <  100  sorted  in descending order of calories.
        fruits.stream()
                .filter(p-> p.getCalories()<100)
                .sorted(Comparator.comparing(Fruit::getCalories))
                .forEach((f)-> System.out.println(f.getCalories()));

        //Display color wise list of fruit names.
        Map<Object, List<Fruit>> colorFruit = fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.groupingBy(Fruit::getColor));


        /*fruits.stream()
                .filter(f->f.getColor().equalsIgnoreCase("Red"))
                .sorted(Comparator.compare())
                .
                .forEach(fruit -> System.out.println("Names According to PRICE of RED FRUITS: "+fruit.getPrice()));
        */
        System.out.println(colorFruit);



    }
}

