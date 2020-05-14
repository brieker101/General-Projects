import java.util.*;

public class AirlineCheckinSim
{
    private PassengerQueue frequentFlyerQueue = new PassengerQueue("FFQ");
    private PassengerQueue regularPassengerQueue = new PassengerQueue("RPQ");
    private int frequentFlyerMax;
    private int maxProcessingtime;
    private int totalTime;
    private boolean showAll;
    private int clock;
    private int timeDone;
    private int frequentFlyersSinceRP;
    
    private static Scanner in;

    public static void main(String[] args){
        AirlineCheckinSim sim = new AirlineCheckinSim();
        in = new Scanner(System.in);
        sim.enterData();
        sim.runSimulation();
        sim.showStats();
        System.exit(0);
    }

    public void runSimulation(){
        for (clock = 0; clock < totalTime; clock++) {
            frequentFlyerQueue.checkNewArrival(clock, showAll);
            regularPassengerQueue.checkNewArrival(clock, showAll);
            if (clock >= timeDone) {
                startServe();
            }
        }
    }

    public void enterData(){
        System.out.println("FFQ arrivalRate");
        frequentFlyerQueue.arrivalRate = in.nextInt();
        
        System.out.println("RPQ arrivalRate");
        regularPassengerQueue.arrivalRate = in.nextInt();
        
        System.out.println("maxProcessingtime");
        maxProcessingtime = in.nextInt();
        
        System.out.println("totalTime");
        totalTime = in.nextInt();
        
        System.out.println("ShowAll");
        if(in.next().equals("Y")){
            showAll = true; 
        }
        else{showAll = false;}
        
    }

    public void startServe(){
        if (!frequentFlyerQueue.isEmpty()
        && ((frequentFlyersSinceRP <= frequentFlyerMax)
            || regularPassengerQueue.isEmpty())) {
            // Serve the next frequent flyer.
            frequentFlyersSinceRP++;
            timeDone = frequentFlyerQueue.update(clock, showAll);
        } else if (!regularPassengerQueue.isEmpty()) {
            // Serve the next regular passenger.
            frequentFlyersSinceRP = 0;
            timeDone = regularPassengerQueue.update(clock, showAll);
        } else if (showAll) {
            System.out.println("Time is " + clock
                + " server is idle");
        }
    }

    private void showStats(){
        System.out.println
        ("\nThe number of regular passengers served was "
            + regularPassengerQueue.getNumServed());
        double averageWaitingTime =
            (double) regularPassengerQueue.getTotalWait()
            / (double) regularPassengerQueue.getNumServed();
        System.out.println(" with an average waiting time of "
            + averageWaitingTime);
        System.out.println("The number of frequent flyers served was "
            + frequentFlyerQueue.getNumServed());
        averageWaitingTime =
            (double) frequentFlyerQueue.getTotalWait()
            / (double) frequentFlyerQueue.getNumServed();
        System.out.println(" with an average waiting time of "
            + averageWaitingTime);
        System.out.println("Passengers in frequent flyer queue: "
            + frequentFlyerQueue.size());
        System.out.println("Passengers in regular passenger queue: "
            + regularPassengerQueue.size());
    }

}
