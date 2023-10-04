package in.co.rays.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseMethod {

	public static void main(String[] args) throws ParseException {
		String str = ("02-10-2023");// same as sdf method follow
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse(str);
		System.out.println(date);
	}

}
