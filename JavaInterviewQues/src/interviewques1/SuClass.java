package interviewques1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SuClass {

	public void getdate() {
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");

		Date date = new Date();

		System.out.println(df.format(date));

	}
}
