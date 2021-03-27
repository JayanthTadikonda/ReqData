import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NewsDatabase {

    public static void main(String[] args) {

        List<News> newsList = Arrays.asList(new News(1,"bbb","bbbsdasdb","asdsddcdzcdsca"),
                new News(1,"abc","asdasd","asasdasdsacdascdacdsa"),
                new News(1,"zc","bbbbsd","asdsdAascasa"),
                new News(1,"am","asdewf","asdsASCASCaa"),
                new News(1,"bc","assdasdasd","asdAsdascascascasc"),
                new News(1,"ae","aASdasd","asasdascascascsa"),
                new News(4,"avc","asdasd","asdascascasca"),
                new News(4,"bbb","bbbsdasdb","asdsddcdzcdsca"),
                new News(4,"abc","asdasd","asasdasdsacdascdacdsa"),
                new News(1,"zc","bbbbsd","asdsdAascasa"),
                new News(3,"am","asdewf","asdsASCASCaa"),
                new News(3,"bc","assdasdasd","asdAsdascascascasc"),
                new News(1,"ae","aASdasd","asasdascascascsa"),
                new News(2,"avc","asdasd","asdascascasca"));

        newsList.stream()
                .max((c,c1)-> c.getcomment().compareToIgnoreCase(c1.getcomment()))
                .stream().forEach(f-> System.out.println(f.getNewsId()));
    }
}
