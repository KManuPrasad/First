package FirstPackage;

public class MethodScope {
	public static void main(String[] args) {
		b1 obj1 = new b1();
		obj1.m1();
		
		System.out.println(obj1.x);
	}
	
	}
	
class b1{
	int x=5,y=8;
	public void m1()
	{
		final int a;
		float f;
		
	}

	

}

