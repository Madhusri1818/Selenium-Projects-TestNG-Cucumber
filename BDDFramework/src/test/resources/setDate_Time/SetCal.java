package setDate_Time;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class SetCal {
	
	public  static void date_timeSet() {
		
		Calendar cal=Calendar.getInstance();
		
		SimpleDateFormat date=new SimpleDateFormat("E, dd:MMM:yyyy  HH:mm:ss Z");
		
		 String Actualdate=date.format(cal.getTime());
		System.out.println(Actualdate);
		
	}
	

}
