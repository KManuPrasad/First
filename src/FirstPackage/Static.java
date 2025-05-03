 package FirstPackage;



 class Static {
	
	static	void  staticMethod()
	 {
		 int x= 5;
		 
		System.out.println("Static means - access without creating an object");
	 }
	 
	public void publicMethod()
	 {
		 System.out.println("Public means - we need a object to access ");
		
	 }
	 
	static double dMethod(double d)
	 {
		 //double d =7.8;
		 System.out.println(d);
		 return d;
	 }
	 
	
	public static void main(String args[])
	{
		Static s = new Static();
		staticMethod();// this is a static method, so no need of object
		s.publicMethod();
		dMethod(4.4);
		
	}
	

}

