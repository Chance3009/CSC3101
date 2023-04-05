// Author’s name: Chan Ci En
// Matric number: 215035
// Lab No: 3

package lab3_2;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class MyDate{
	private int year, month, day;
	
	// Create MyDate object with current date
	public MyDate() {
		Calendar date = new GregorianCalendar();
		year = date.get(Calendar.YEAR);  
		month = date.get(Calendar.MONTH);
		day = date.get(Calendar.DAY_OF_MONTH); 
	}

	// Return year
	public int getYear() {
		return year;
	}
	
	// Return month
	public int getMonth() {
		return month;
	}
	
	// Return day
	public int getDay() {
		return day;
	}
	
	@Override
	public String toString() {
		return day +"/" + (month+1) + "/" + year;
	}
}
