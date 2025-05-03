package FirstPackage;
class Second
{
	 int x;
	float a =12.334f;
	void method()
	 {
	 double u = x+a;
	 System.out.println(u);
	 }
	}

public class Learn {
	/*
	 * primitive data types byte n1 = 122; short s; - 2 bytes int num; - 4 bytes
	 * long l; - 8 float f= 3.33; double d= 88.00999999; boolean booo; char n; 2
	 * bytes n = 'A';
	 */
	

	public static void main (String args[])
	{
		String name, last;
		name = "\"you";
		last = "are?";
		int a,b,c;
		a= 10;
		b=12;
// object
		Second l= new Second();
		l.x=12;
		l.method();
		
	}
}

