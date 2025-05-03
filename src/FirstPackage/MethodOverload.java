package FirstPackage;

public class MethodOverload {
	
	static int add(int a, int b)
	{
		
		return a+b;
	}
	static int add(int e, int f, int g)
	{
		
		return e+f+g;
	}
	static float  add(int x, float y, float z)
	{
		
		return x+y+z;
	}
	
	public static void main(String args[])
	{
		float finl = add(7,4.5,5.5);
	}

}
