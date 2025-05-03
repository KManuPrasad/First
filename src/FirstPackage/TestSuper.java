package FirstPackage;

public class TestSuper {
	
	void testMethod()
	{
		System.out.println("This is parent method ");
		
	}
	

}

class Sub extends TestSuper{
	
	void testMethod()
	{
		super.testMethod();//super keyword should be used inside the method of the subclass
		System.out.println("Subclass method");
	}

	
}

class Main{
	public static void main(String[] args) {
		
		
		Sub obj = new Sub();
		obj.testMethod();
	}
	
	
}
