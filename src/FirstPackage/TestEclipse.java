package FirstPackage;

class Object1{
	public int method1(int x, int y)
	{
		
		int result = x+y;
		System.out.println(result);
		return result;
		
	}
	}
	class Object2{
	public void method2()
	{
		
		System.out.println("Method 2");
	}
	}

	public class TestEclipse {
		public static void main(String args[])
		{
			
		Object1 obj1= new Object1();
		Object2 obj2= new Object2();
		
		System.out.println(obj1.method1(3,6));
	
		System.out.println(obj1.method1(13,6));
//		obj1.method1(23,6);
//		obj1.method1(43,6);
		//obj2.method2();
		}
		
		}
	
	
	


