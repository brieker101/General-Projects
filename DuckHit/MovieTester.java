import java.util.ArrayList;

public class MovieTester
{
    public Movie m1;
    public Movie m2;
    public Movie m3;
    public Movie m4;
    public Movie m5;
    public Movie m6;
    public Movie m7;

    public ArrayList<Movie> l1;
    public ArrayList<Movie> l2;
    public ArrayList<Movie> l3;

    public MovieTester(){

        m1 = new Movie(1,5.5, null);
        m2 = new Movie(2,7, l1);
        m3 = new Movie(3,3.1, null);
        m4 = new Movie(4,9, l2);
        m5 = new Movie(5,6, null);
        m6 = new Movie(6,1, l3);
        m7 = new Movie(7,10, null);

        l1.add(m1);
        l1.add(m4);

        l2.add(m3);
        l2.add(m6);

        l3.add(m7);
        l3.add(m5);

    }

    public static void main(String[] args){
        MovieTester mt = new MovieTester();

        HighRatedMovies movieTest = new HighRatedMovies();

        //Test 1
        ArrayList<Movie> result1 = movieTest.score(mt.m2, 2);

        String expected1 = "Expected: 7, 10 4,9";
        String recieved1 = "Recieved: ";
        for(Movie singleMovie: result1){
            recieved1 += singleMovie.getId() + ", " + singleMovie.getRating() + " ";
        }

        System.out.println(expected1);                
        System.out.println(recieved1);

        //Test2
        ArrayList<Movie> result2 = movieTest.score(mt.m6, 10);

        String expected2 = "Expected: ";
        String recieved2 = "Recieved: ";
        for(Movie singleMovie: result2){
            recieved2 += singleMovie.getId() + ", " + singleMovie.getRating() + " ";
        }

        System.out.println(expected2);                
        System.out.println(recieved2);                

        //Test3
        ArrayList<Movie> result3 = movieTest.score(mt.m5, 2);

        String expected3 = "Expected: 7, 10 5, 6";
        String recieved3 = "Recieved: ";
        for(Movie singleMovie: result3){
            recieved3 += singleMovie.getId() + ", " + singleMovie.getRating() + " ";
        }

        System.out.println(expected3);                
        System.out.println(recieved3);

    }

}
