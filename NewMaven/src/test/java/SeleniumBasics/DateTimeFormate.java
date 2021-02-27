package SeleniumBasics;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormate {

	public static void main(String[] args) throws ParseException {

//		SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
//		Date nowdate = new Date();
//		String exactdate = date.format(nowdate);
//
//		System.out.println("todays date" + exactdate);
//
//		String[] datearray = exactdate.split("/");
		// System.out.println(datearray[1]);
//
//		String dateaftersplit = datearray[1];
//		int i = Integer.parseInt(dateaftersplit);
//		int dayafterincrements = i + 10;
//		datearray[1] = Integer.toString(dayafterincrements);
//
//		 System.out.println(datearray[1]);
//		String finaldate = datearray[0] + "/" + datearray[1] + "/" + datearray[2];
//		System.out.println("after 10 days from today date" + "\t" + finaldate);

		// String updateddate = "Today+3";
		// int daysadding = Integer.parseInt(updateddate.substring(6, 7));
		// System.out.println(daysadding);
		// SimpleDateFormat sdf = new SimpleDateFormat("Month D, Yr");

		DateFormat df = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);

		// Date dt = df.parse("February 7, 2011");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 5); // Adding 5 days
		String output = df.format(c.getTime());
		String datetoday = df.format(new Date());
		// System.out.println(dt);
		System.out.println(datetoday);
		System.out.println(output);

	}

}
