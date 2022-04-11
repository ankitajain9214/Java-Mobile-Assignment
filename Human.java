package JavaPractice;

public class Human 
{
	public static String humanName = "Prakhar";
			
	public static int humanAge = 35;
	
	public static boolean isMale = true;
			
	public static char humanGender = 'M';
	
	
	public static void main (String [] args)
	{
		Human Ankita = new Human();
		Ankita.name();
		Ankita.gender();
		
		System.out.println(" My name is" +humanName+ " and my age is "+humanAge+ "and my gender is" +humanGender);
		
		
		String humanName = "Aastha";
		int humanAge = 40;
		char humanGender = 'F';
		
		System.out.println(" My name is" +humanName+ " and my age is "+humanAge+ "and my gender is" +humanGender);
		
		//System.out.println(humanname);
		//System.out.println(age);
		//System.out.println(male);
		//System.out.println(humangender);
		
		
				
	}
	
	public void name()
	{
		//System.out.println("This is my Name");
		
		//System.out.println(humanname);
		
		//System.out.println(humanName);
		
		String humanName = "Aastha";
		
		//System.out.println(humanName);
		
	}
	
	public void gender()
	{
		//System.out.println("This is the gender");
		
		int humanAge = 40;
		
		//System.out.println(humanAge);
		
		
	}
	
	
	
}
