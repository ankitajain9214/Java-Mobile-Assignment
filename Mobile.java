package week1.day1;

public class Mobile {
	
	public static String mobileModel = "E52";
	
	public static int mobileWeight = 100;
	
	public static boolean isFullCharge = true;
	
	public static double mobileCost = 255.78;	

	public static void main(String[] args) {
		Mobile Nokia = new Mobile();
		Nokia.makeCall();
		Nokia.sendMsg();
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		System.out.println(isFullCharge);		
		System.out.println(mobileCost);

	}
	
	public void makeCall()
	{
		System.out.println("This is my make call method");
	}
	
	public void sendMsg()
	{
		System.out.println("This is my send msg method");
	}

}
