import java.util.*;
import java.util.stream.Collectors;

public class NewsDatabase {

    public static void main(String[] args) {

        List<News> newsList = Arrays.asList(new News(1,"bbb","bbbsdasdb","asdsddcdzcdsca"),
                new News(1,"abc","asdasd","asasdasds acda scdacdsa"),
                new News(1,"zc","bbbbsd","asdsdAasc asa"),
                new News(1,"am","asdewf","asdsASCAS Caa"),
                new News(1,"bc","assdasdasd","asdAs dascasc ascasc"),
                new News(1,"ae","aASdasd","asasdascascascsa"),
                new News(4,"avc","asdasd","asdascascasca"),
                new News(4,"bbb","bbbsdasdb","asdsddcdz budget budget cdsca"),
                new News(4,"abc","asdasd","asas budget dasdsacdascdacdsa"),
                new News(1,"zc","bbbbsd","asdsdAascasa"),
                new News(3,"am","asdewf","asdsASCASCaa"),
                new News(3,"bc","assdasdasd","budget as dAsdascascascasc"),
                new News(3,"ae","aASdasd","asasdascascascsa"),
                new News(2,"avc","asdasd","asdascascasca"));

/*
        int newscount = (int) newsList.stream()
                .count()
                .max((c,c1)-> c.getcomment().compareToIgnoreCase(c1.getcomment())).stream().count();
        //Find out which user has posted maximum comments.
        Optional<Object> mostCommonTag = newsList.stream()
                .collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()))
                // fetch the max entry
                .entrySet().stream().max(Map.Entry.comparingByValue())
                // map to tag
                .map(Map.Entry::getKey);

        //Find out which newsID has maximum comments.
        Optional<Object> mostCommonID = newsList.stream()
                .collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()))
                // fetch the max entry
                .entrySet().stream().max(Map.Entry.comparingByValue())
                // map to tag
                .map(Map.Entry::getKey);
        int i = (int) newsList.stream()
                .filter((word)-> Arrays.stream(word.getcomment().split(" ")).allMatch(p->p.contains("budget"))).count();

        System.out.println(mostCommonTag);
        System.out.println(mostCommonID);

*/
        newsList.stream().collect(Collectors.groupingBy(News::getPostedByUser,Collectors.counting()),


    }
}
