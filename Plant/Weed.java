public class Weed extends Plant{
    public Weed(String plant, double base){
        super(plant, base);
    }
    
    public void grow(){
        setSize(getSize() + 1.25);
    }
  
}
