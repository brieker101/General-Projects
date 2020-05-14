import java.util.ArrayList;

public class Movie
{
    private int id;
    private double rating;
    private ArrayList<Movie> similiarMovies;
    
    public Movie(int inputId, double inputRating, ArrayList<Movie> inputMovies){
        id = inputId;
        rating = inputRating;
        similiarMovies = inputMovies;
    }
    
    public int getId(){
        return id;
    }
    
    public double getRating(){
        return rating;
    }
    
    public ArrayList<Movie> getSimiliarMovies(){
        return similiarMovies;
    }

}
