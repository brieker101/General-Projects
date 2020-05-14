/**
 * Tester that creates two clocks, assigns values through user input, and then compares them
 * 
 * 
 * @author Brian Hauck
 */
import java.util.*;

public class Tester {
	
	public static void main(String[] args) {
		
		//These need to be -1 to start the while loops for input
		int hours = -1;
		int minutes = -1;
		int seconds = -1;
		
		//Scanner and initial clocks
		Scanner in = new Scanner(System.in);
		Time time1 = new Time(0,0,0);
		Time time2 = new Time(0,0,0);
		
		//Get the hours and catch exception InputMismatchException
		//Terminate if the catch is run
		//Loop again if value entered is outside of required parameters
		while(hours>23||hours<0) {
			System.out.println("Please enter the hours (0-23) : ");
			try {
				hours = in.nextInt();			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect input detected, goodbye.");
				System.exit(0);

			}
		}
		//Finally set the hours
		time1.setHours(hours);

		
		//Get the minutes and catch exception InputMismatchException
		//Terminate if the catch is run
		//Loop again if value entered is outside of required parameters

		while(minutes>59||minutes<0) {
			System.out.println("Please enter the minutes (0-59) : ");
			try{
				minutes = in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect input detected, goodbye.");
				System.exit(0);

			}
		}
		//Finally set minutes
		time1.setMinutes(minutes);
		
		
		//Get the seconds and catch exception InputMismatchException
		//Terminate if the catch is run
		//Loop again if value entered is outside of required parameters

		while(seconds>59||seconds<0) {
			System.out.println("Please enter the seconds (0-59) : ");
			
			try{
				seconds = in.nextInt();
				}
			catch(InputMismatchException e) {
				System.out.println("Incorrect input detected, goodbye.");
				System.exit(0);
			}
		}
		//Finally set seconds
		time1.setSeconds(seconds);

		//Reuse the previous variables for the next time clock. If we were doing more clocks, I would have made this a loop
		hours = -1;
		minutes = -1;
		seconds = -1;
		
		//Refer to previous hour input get
		while(hours>23||hours<0) {
			System.out.println("Please enter the hours (0-23) : ");
			try {
				hours = in.nextInt();			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect input detected, goodbye.");
				System.exit(0);

			}
		}
		
		time2.setHours(hours);

		
		//Refer to previous minute input get
		while(minutes>59||minutes<0) {
			System.out.println("Please enter the minutes (0-59) : ");
			try{
				minutes = in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect input detected, goodbye.");
				System.exit(0);

			}
		}
		
		time2.setMinutes(minutes);
		
		//Refer to previous second input get
		while(seconds>59||seconds<0) {
			System.out.println("Please enter the seconds (0-59) : ");
			
			try{
				seconds = in.nextInt();
				}
			catch(InputMismatchException e) {
				System.out.println("Incorrect input detected, goodbye.");
				System.exit(0);
			}
		}
		
		time2.setSeconds(seconds);
		
		//Finally compares our two valid clocks
		//1 if they are the same
		//0 if they are not
		if(time1.compareTo(time2)==1) {
			System.out.println("Both of these clocks are the same!");
		}
		else {
			System.out.println("These clocks are not the same!");
		}
		
	}
}
