import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class App {

	public static void main(String[] args) throws ParseException {
		
		
		
		String strDate = "17/12/2016 12:02";
		
		//String to date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		Date date1;
		try {
			date1 = sdf.parse(strDate);
			System.out.println("String to Date: "+date1);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
		//Date to String
		Date date2 = new Date(2016-1900, 11, 17);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		String dateString = sdf2.format(date2);

		System.out.println(" Date to String: "+dateString);
		
		//Date to Calendar
		Date date3 = new Date();
		//calendar is abstract class, so make an instance of it
		Calendar cal = Calendar.getInstance();
		cal.setTime(date3);
		System.out.println("Date to Calendar: ");
		System.out.println(cal.get(Calendar.YEAR));
		
		//Calendar to Date
		Calendar cal2 = new GregorianCalendar(2016, 11, 17);
		Date date4 = cal.getTime();
		System.out.println("Calendar to Date: "+date4);
		
		double payment = 12324.256;
		NumberFormat localPayment;
		localPayment = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(localPayment.format(payment));
		localPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(localPayment.format(payment));
		localPayment = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		System.out.println(localPayment.format(payment));
		localPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(localPayment.format(payment));
		
		System.out.println(String.format(new Locale("en", "in"), "String Locale %,d", 1234567890));	
		String s= new String("satya");
		//Constant string pool
		System.out.println(s.intern());
		String str = new String(String.format(new Locale("en", "in"), "String Locale %,d", 1234567890));
		str.toLowerCase(Locale.US);
		System.out.println(str);
		
	}

}
