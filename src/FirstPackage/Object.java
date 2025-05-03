package FirstPackage;

 class getData{
	int a =3;
	int b =7;
	int result;
	
	void perform () {
		result= a+b;
		System.out.println(result);
	}
}

 class AnotherClass{
	 
	void m()
	{
		System.out.println("just a method in a class");
	}
	
	
}

public class Object {
public static void main(String args[])

{
	getData j = new getData();
	AnotherClass k = new AnotherClass();
	//j.perform();
	System.out.println(j.result);
	k.m();
	
}
}
