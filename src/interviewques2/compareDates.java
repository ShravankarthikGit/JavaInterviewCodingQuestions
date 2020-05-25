package interviewques2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class compareDates {

	public static void main(String args[]) {
		// DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date1 = new Date();
		// System.out.println(dateFormat.format(date1));
		Date date2 = new Date();

		if ((date1.compareTo(date2)) > 0) {
			System.out.println("Date1 is after date2");
		} else if ((date1.compareTo(date2)) > 0) {
			System.out.println("Date1 is past Date2");
		} else {
			System.out.println("Date1 is equal to Date2");
		}
		
		cdates();
		
	}

	public static void cdates() {
		Date date1 = new Date();
		Date date2 = new Date();

		if (date1.after(date2)) {
			System.out.println("Date1 is after date2");
		}
		if (date1.before(date2)) {
			System.out.println("Date1 is before date2");
		}
		if (date1.equals(date2)) {
			System.out.println("Date1 equals date2");
		}
	}
}
