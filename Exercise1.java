package JavaPractice;

public class Exercise1 {
	
	public static void main (String [] args)
	{


		//convert Fahrenheit to celsius//
				
		double tempFah = 212.0;
		//C= (F-32)*5/9
		
		double tempCel = (tempFah - 32) *5/9;
		
		System.out.println( tempFah+ " degree Fahrenheit is equal to "  +tempCel+  " in Celsius");	
		
		//convert inch to meters//
		
		double inch = 1000.0;
				
		double meter = inch * 0.0254;
		
		System.out.println( inch + " inch is " + meter + " meters" );
		
		//convert minutes to years//
		
		int minutes = 3456789;
		
		int hours	= minutes / 60;
		
		int days = hours / 24;
		
		int years = days / 365;	
		
		int nDays = days%365;
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + nDays + " days");
		
		}
	

	
}
