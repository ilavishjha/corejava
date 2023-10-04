package in.co.rays.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormateMethod {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(date);
		System.out.println(str);

	}

}
