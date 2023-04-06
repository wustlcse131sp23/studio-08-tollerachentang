package studio8;

import java.util.Objects;

public class Time {
	
	private int hours;
	private int minutes;

	
	/**
	 * it's a constructor making an object in Time class with 
	 * @param hour
	 * @param minute
	 */
	public Time (int hour, int minute) {
		this.hours = hour;
		this.minutes = minute;
	}

	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
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
		return true;
	}





	public String toString () {
		return "" + hours + ":" + minutes;
	}
	
	public static void main(String[] args) {
		Time t1 = new Time (15, 03);
		System.out.println(t1);
    	
    }

}