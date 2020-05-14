import java.util.ArrayList;

public class HighRatedMovies
{
   public HighRatedMovies(){}
   
   public ArrayList<Movie> score(Movie movie, int relatedMovies){
       ArrayList<Movie> holder = new ArrayList<Movie>();
       for(int i = 0;i<relatedMovies;i++){
           movie.getSimiliarMovies();
        }
       
       return holder;
   }
   
}
