package FirstPackage;

  public class MultipleObjects {

	String firstName = "Manu";
	String lastName = "Prasad";
	 int number  =5;
	
	 
	 public final static void m1()
	 {
		 int x= 80;
		 x=90;
		System.out.println(x);
	 }
	
	public static void main(String args[])
	{
		
		MultipleObjects mo1= new MultipleObjects();
		mo1.m1();
		System.out.println("Name is: "+mo1.firstName+" "+mo1.lastName +" and number is :"+mo1.number);
	}
}
