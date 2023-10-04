package in.co.rays.dateandtime;

import java.util.Calendar;
import java.util.Date;

public class Calen {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 10);
		Date date = cal.getTime();
		System.out.println(date);
	}
}
