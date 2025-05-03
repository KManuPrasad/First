package FirstPackage;

public class UsingMethods {
	
	int rollNumber;
	String studentName;
	 static int just(int numb) 
	{ int x=5;
		System.out.println(" number is "+numb+x);
		return numb;
		}
	public  void setDetails()
	{
		studentName = "tom";
		rollNumber = 12;
	
	}
	void getDetails()
	{
		System.out.println("name is "+studentName);
		System.out.println("Roll number is\t"+rollNumber);
	}
	
public static void main(String args[])
{
	UsingMethods object = new UsingMethods();
	// class name objectRef = new Classname();
    object.setDetails();
	object.getDetails();
//	just(12);
//	just(33);
//	just(44);
	
}

}
