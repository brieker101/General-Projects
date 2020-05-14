public class MontecarloLab
{
    private double inside;
    private double totalCount;
    private double piRatio;
    private double r;
   public MontecarloLab(){
       r = 1;
       inside = 1;
       totalCount = 10000;
       piRatio = inside/totalCount;
    }
    
    public double calculatePi(){
        double teller;
        for(int i = 0;i<totalCount;i++){
            teller = Math.random() * Math.sqrt((r*r)+(r*r));
            System.out.println(teller + "   " + i);
            if(teller<=r){
                inside++;
            }            
        }
            System.out.println("4" + "*" + inside + "/" + totalCount);
        return 4 * piRatio;
    }
}
