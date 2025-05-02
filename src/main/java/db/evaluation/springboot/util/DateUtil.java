package db.evaluation.springboot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String convertDateToString(Date date) {
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}
	
	public static Date convertToDate(String dateStr) throws Exception {
		return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
	}
}
