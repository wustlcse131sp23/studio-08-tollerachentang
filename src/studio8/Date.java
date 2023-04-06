package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;

	/**
	 * it's a constructor making an object in Date class with following parameters
	 * @param day
	 * @param month
	 * @param year
	 * @param isHoliday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}

	public String toString() {
		if(isHoliday) {
		return month + " " + day + ", " + year + " is a holiday.";}
		else {
			return month + " " + day + ", " + year + " is not a holiday.";
		}
		
	}
	
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	
	public static void main(String[] args) {
    	Date d1 = new Date (4, 6, 2023, false);
    	Date d2 =  new Date (4, 6, 2023, false);
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1);
    	list.add(d2);
    	list.add(d1);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d1);
    	System.out.println(set);
    }

}
