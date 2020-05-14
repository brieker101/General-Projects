/**
 * The Time class creates an object that contains hours, minutes, and seconds. 
 * A developer can increment the set time by a one or a custom amount.
 * The time values fix themselves whenever they are incremented and roll over 23h/59m/59s
 */

/**
 * Q1: Since our program is designed as a 24Hour clock, any returned value from the system clock
 * should match perfectly without errors. It is not NECESSARY but it should probably be done anyway
 * to make sure that the system clock is not broken.
 * 
 * Q2: incrementSeconds(), incrementMinutes(), incrementHours(), 
 * setSeconds(), setMinutes(), setHours(), fixMinutes(), fixHours().
 */

/**
 * @author Brian Hauck
 *
 */

import java.util.*;

public class Time implements Comparable<Time>{
	
	//Sets initial global variables
	private int hours, minutes, seconds;
	
	//Sets up the one time use calendar for a no-argument Time constructor
	GregorianCalendar timer;
	
	/**
	 * Custom Time constructor that sets each value to given values
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public Time(int hours, int minutes, int seconds) {
		super();
		if(hours>24||minutes>59||seconds>59||hours<0||minutes<0||seconds<0) {
			if(hours>23||hours<0) {
				System.out.println("Hours entered cannot be above 23!" + "\n" + "Entered value: " + hours);
			}
			if(minutes>59||minutes<0) {
				System.out.println("Minutes entered cannot be above 59!" + "\n" + "Entered value: " + minutes);
			}
			if(seconds>59||seconds<0) {
				System.out.println("Seconds entered cannot be above 59!" + "\n" + "Entered value: " + seconds);
			}
			throw new InvalidTimeException();
		}
		else {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
	}
	
	/**
	 * Default constructor that uses the GregorianCalendar object to get current time values
	 */
	public Time() {
		super();
		timer = new GregorianCalendar();
		hours = timer.get(Calendar.HOUR_OF_DAY);
		minutes = timer.get(Calendar.MINUTE);
		seconds = timer.get(Calendar.SECOND);
	}
	
	/**
	 * Add one to seconds count
	 * Automatically resets the count back to zero and adds the amount of time over to minutes
	 */
	public void incrementSeconds() throws InvalidTimeException {
		seconds++;
		fixMinutes();
		}
	
	/**
	 * Add given amount to seconds count
	 * Automatically resets the count back to zero and adds the amount of time over to minutes
	 */
	public void incrementSeconds(int seconds) throws InvalidTimeException {
		this.seconds = this.seconds + seconds;
		fixMinutes();
		}
	
	/**
	 * Checks if seconds is greater than 59
	 * Uses the / operator to find out how many minutes to add
	 * Uses the % operator to get the leftover seconds
	 */
	private void fixMinutes() throws InvalidTimeException {
		if(seconds>59) {
			incrementMinutes(seconds/60);
			seconds = seconds%60;
			}
	}
	
	/**
	 * Add one to minutes count
	 * Automatically resets the count back to zero and adds the amount of time over to hours
	 */
	public void incrementMinutes() throws InvalidTimeException {
		minutes++;
		fixHours();
		}
	
	/**
	 * Add given amount to minutes count
	 * Automatically resets the count back to zero and adds the amount of time over to minutes
	 */
	public void incrementMinutes(int minutes) throws InvalidTimeException {
		this.minutes = this.minutes + minutes;
		fixHours();
		}
	
	/**
	 * Checks if minutes is greater than 59
	 * Uses the / operator to find out how many hours to add
	 * Uses the % operator to get the leftover minutes
	 */
	private void fixHours() throws InvalidTimeException {
		if(minutes>59) {
			incrementHours(minutes/60); 
			minutes = minutes%60;
		}
	}
	
	/**
	 * Add one to hours count
	 * Automatically resets the count back to zero if over 23
	 */
	public void incrementHours() throws InvalidTimeException {
		hours++;
		if(hours>23) {
			hours = hours%24;
			}
		}
	
	/**
	 * Add given amount to hours count
	 * Automatically resets the count back to zero if over 23
	 */
	public void incrementHours(int hours) throws InvalidTimeException {
		this.hours = this.hours + hours;
		if(this.hours>23) {
			this.hours = this.hours%24;
			}
		}
	
	/**
	 * Generates basic string for time
	 */
	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}

	/**
	 * Gets hours	
	 * @return hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * Sets hours
	 * @param hours
	 */
	public void setHours(int hours) throws InvalidTimeException {
		if(hours>24||hours<0) {
			throw new InvalidTimeException();
		}
		else {
			this.hours = hours;
		}
	}

	/**
	 * Gets minutes
	 * @return minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * Sets minutes
	 * @param minutes
	 */
	public void setMinutes(int minutes) throws InvalidTimeException {
		if(minutes>59||minutes<0) {
			throw new InvalidTimeException();
		}
		else {
			this.minutes = minutes;
		}
	}

	/**
	 * gets seconds
	 * @return seconds
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * Sets the seconds
	 * @param seconds
	 */
	public void setSeconds(int seconds) throws InvalidTimeException{
		if(seconds>59||seconds<0) {
			throw new InvalidTimeException();
		}
		else {
			this.seconds = seconds;
		}
	}

	/**
	 * Returns a number depending on whether they match
	 * @return int 0 or 1
	 */
	@Override
	public int compareTo(Time obj) {
		if(hours==obj.getHours()&&minutes==obj.getMinutes()&&seconds==obj.getSeconds()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
		result = prime * result + ((timer == null) ? 0 : timer.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		if (timer == null) {
			if (other.timer != null)
				return false;
		} else if (!timer.equals(other.timer))
			return false;
		return true;
	}
}
