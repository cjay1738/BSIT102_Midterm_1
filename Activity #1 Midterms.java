import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Birthday {

    public static void main (String[] args ) throws Exception {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String bday1;
    	
    	Date date = new Date();
    	SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy");
    	Calendar calendar = new GregorianCalendar();
    	
    	System.out.println("Enter Your Birthdate");
    	bday1 = sc.nextLine();
    	String input_bday = "8-8-2000";
    	Date bday = format.parse(input_bday);
    	
    	int year = calendar.get(Calendar.YEAR);
    	calendar.setTime(bday);
    	int byr = calendar.get(Calendar.YEAR);
    	
    	int age = year - byr;
    	System.out.print("My age: " + age);
    	
    }
    
    
}