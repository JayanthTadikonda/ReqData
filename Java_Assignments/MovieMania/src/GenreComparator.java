import java.util.Comparator;

public class GenreComparator implements Comparator<Movie_Details> {
    @Override
    public int compare(Movie_Details o1, Movie_Details o2) {
        return o1.getGenre().compareToIgnoreCase(o2.getGenre());
    }
}
