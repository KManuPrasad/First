package FirstPackage;

public class VariableTypes {
	
	int a = 19;// Instance variable
	static int b =89; // static variable or class variable
	void method1(){
		int x =77;//local variable
		System.out.println(b);
		System.out.println(a);
		
		
	}
	public static void main(String[] args) {
		
		VariableTypes var = new VariableTypes();
		var.method1();
		System.out.println();
		System.out.println(var.a);
		
		
		
	}

}
