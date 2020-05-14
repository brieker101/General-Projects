//Brian Hauck
import java.util.Scanner;

public class ClockTester
{
    public static void main(String[] args){
        int timeZone;
        Scanner in = new Scanner(System.in);
        DefaultClock timer = new DefaultClock();
        System.out.println("Current Time: ");
        timer.getTime();

        System.out.println("What timezone are you in? (Include the +/-)");
        timeZone = in.nextInt();

        System.out.println("This is the time in " + timeZone);
        WorldClock localClock = new WorldClock(timeZone);

    }
}
