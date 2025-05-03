package FirstPackage;

public class Constructor {
	int a,b;
	  float f;
	  String name;
	  Constructor(float g, float h)// constructor with 2 params
	  {
		  g=6.7f;
		  h= 5.6f;
		  System.out.println(g+" "+h);
		  
	  }
	  
	  Constructor(int x, int y, String n) // constructor with 3 params
	  {
		  a=x;
		  b=y;
		  name =n;
		  System.out.println(a+b+" "+name);
	  }
		
		public static void main (String args[])
		{
			
			Constructor obj = new Constructor(1,2,"manu");
			Constructor O2 = new Constructor(9.0f,8.0f);
			
		}
		

}
