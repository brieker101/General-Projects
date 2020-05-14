import java.util.*;

public class Passenger
{
    private int passengerId;
    private int processingTime;
    private int arrivalTime;
    private static int maxProcessingTime;
    private int idNum;
    Random rng = new Random();
    
    public Passenger(int arrivalTime){
        this.arrivalTime = arrivalTime;
        processingTime = 1 + rng.nextInt(maxProcessingTime);
        passengerId = idNum++;
    }

    public int getArrivalTime(){return arrivalTime;}

    public int getProcessingTime(){return processingTime;}

    public int getId() {return passengerId;}

    public static void setMaxProcessingtime(int maxProcessTime){maxProcessingTime = maxProcessTime;}
}
