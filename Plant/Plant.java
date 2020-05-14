public class Plant implements Comparable
{
   private String name;
   private double size;
   
   public Plant(String plant, double base){
        name = plant;
        size = base;    
    }
    
   public void grow(){
        size = size + 1.0;
   }
   
   public double getSize(){return size;}
   public void setSize(double size){this.size = size;}
   
   public String getName(){return name;}
   public void setName(String name){this.name = name;}
   
   public String toString(){
       return name + "\n" + size;
    }
   
   public int compareTo(Object obj){
    if(((Plant)obj).getName().equals(name)&&((Plant)obj).getSize()==size){
        return 1;
    }
    else{
        return -1;
    }
   }
}
