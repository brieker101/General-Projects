public class Tree extends Plant
{
  public Tree(String plant, double base){
        super(plant, base);
    }
    
    public void grow(){
        setSize(getSize() + .5);
    }
}
