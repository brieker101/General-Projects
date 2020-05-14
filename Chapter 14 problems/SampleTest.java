import java.util.Date;
public class SampleTest
{
    public void sample(int lowestValue, int highestValue, int calculations){
        //I sort of understand what the problem wants but don't get it entirely.
        //It wants time taken to do a selection sort
        long time1 = 0;
        long time2 = 0;
        time1 =  new Date().getTime();
        for(int i = 0;i<lowestValue;i++){
            for(int j = 0;j<lowestValue;j++){
                if((long)j/2==(long)lowestValue){
                    time2 = new Date().getTime();
                    time2 = time2 - time1;
                    System.out.println("Time after " + (long)lowestValue/2 + " iterations: " + time2 + "ms");
                }
                int z = 1;
                z = 3;
                int k = z;
            }
        }
        time2 = new Date().getTime();
        time2 = time2 - time1;
        System.out.println("Time after " + lowestValue + " calulations: " + time2 + "ms");
        //Lowest time possible
        time1 =  new Date().getTime();
        for(int i = 0;i<highestValue;i++){
            for(int j = 0;j<highestValue;j++){
                if((long)j/2==(long)highestValue){
                    time2 = new Date().getTime();
                    time2 = time2 - time1;
                    System.out.println("Time after " + (long)highestValue/2 + " iterations: " + time2 + "ms");
                }
                int z = 1;
                z = 3;
                int k = z;
            }
        }
        time2 = new Date().getTime();
        time2 = time2 - time1;
        System.out.println("Time after " + highestValue + " calulations: " + time2 + "ms");
        //Highest Time possible
       
    }
}
