public class MovieMain {

    public static void main(String[] args) {

        MovieDetailsList m = new MovieDetailsList();

        m.addMovie("titanic","Jack","simren","Thriller");
        m.addMovie("zz","Jack","simren","Thriller");
        m.addMovie("aa","Jack","simren","Thriller");

       m.findMovieByName("Titanc");

        //System.out.println(m.toString());

        //m.removeAllMovies();
        //m.findMovieByGenre("Thriller");

        //System.out.println(m.toString());

        //m.sortBy("name");
    }
}
