package FirstPackage;

public class Cars {
	
	int num =12;
	String name = "Toyota";
	
	public void displayCar() 
	{
		System.out.println("name is "+name+" and number is: "+num);
		
	}
	
	static class NewCar extends Cars{
		
		void method()
		{
			System.out.println("I am new car");
		}
	}
 public static void main (String args[])
 {
	 
	 NewCar n= new NewCar();
	 n.displayCar();
	 n.method();
	 
 }
}
