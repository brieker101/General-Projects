public class Rectangle
{   
    //On my honor I did not look up any solutions.
    //On my honor, I did not look up the solutions online.
    
    public Rectangle(){
    }

    public int getArea(int l, int w){
            if(l==0||w==0){
                return 0;
            }
            //Recursion got easier when I realized that it is really just a dynamic variable
            //getArea is actually a number that changes depending on the level of recursion
            int area = l + w-1 + getArea(l-1, w-1);
            //The method will keep diving downwards until you return something.
            //That something is the if statement
            return area;
    }
}
