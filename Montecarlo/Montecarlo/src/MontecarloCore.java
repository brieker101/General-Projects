	//Imports the Random package
	import java.util.*;
	//Import the package that draws the dots

	public class MontecarloCore
	{
	    //Setting up necessary variable for estimating pi
	    private double totalCount;
	    private double insideCount;
	    private double radius; 
	    
	    //Random generator
	    private Random rng;   
	    
	    //Prepares for the estimation of pi
	    public MontecarloCore(double testCount, double radius){
	        insideCount = 0;
	        totalCount = testCount;
	        this.radius = radius;
	        rng = new Random();
	    }

	    //Starts estimation(Resets values, casts darts, records inside values)
	    public double estimatePi(){
	        insideCount = 0;
	        double x;
	        double y;
	        double teller;
	        for(int i = 0;i<totalCount;i++){
	            //Generate Random value between 0 and the corner of the square
	            x = rng.nextDouble()*radius;
	            y = rng.nextDouble()*radius;
	            teller = Math.sqrt(x*x + y*y);
	            
	            //System.out.println(x + " " + y);
	            if(teller<=radius){
	                insideCount++;
	            }

	        }
	        //System.out.println(insideCount + "/" + totalCount);
	        double pi = 4*(insideCount/totalCount);
	        //Return the above equation
	        return pi;
	    }
	}