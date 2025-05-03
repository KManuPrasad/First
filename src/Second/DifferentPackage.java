package Second;
import FirstPackage.Rev;
public class DifferentPackage extends Rev{
	
	public static void main(String[] args) {
		DifferentPackage d= new DifferentPackage();
		d.name= "manu";// protected variable can be accessed in different package using inheritance
	System.out.println(	d.name);
	}


}
