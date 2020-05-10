package reusables;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CommonFunctions {
	
	public static String getTodaysDate() {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat form = new SimpleDateFormat("ddMMyyyy");
		String date = form.format(cal.getTime());
		return date;
	}
	
	public static String getTodaysDateAndTime() {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat form = new SimpleDateFormat("ddMMHHmmss");
		String date = form.format(cal.getTime());
		return date;
	}
	

}
