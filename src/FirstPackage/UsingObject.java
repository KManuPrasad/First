package FirstPackage;

 class UsingObject {
	
	public void method1()
	{
		
		System.out.println("Method 9");
	}

}

 class Object2{
	

	public void method2()
	{
		
		System.out.println("Method 21");
	}

}

 class TheMain{
	 public static void main(String args[])
	 {
		 UsingObject objOne = new UsingObject();
		 Object2 objTwo = new Object2();
		 
		 objOne.method1();
		 objTwo.method2();
	 }
	 
 }