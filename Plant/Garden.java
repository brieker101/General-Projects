public class Garden
{
    public Garden()
    {
    }
    
    public void tendGarden(double selector){ 
        Plant growth1;
        Plant growth2;
        if(selector>=2){
            growth1 = new Plant("Plant", 1.0);
            growth2 = new Plant("Plant", 1.0);
        }
        else if(selector>=1){
            growth1 = new Weed("Weed", .25);
            growth2 = new Tree("Tree", 2.0);
        }
        else{
            growth1 = new Tree("Tree", 2.0);
            growth2 = new Weed("Weed", .5);
        }
        
        System.out.println(growth1.toString());
        System.out.println(growth2.toString());
        
        if(growth1.compareTo(growth2)==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
