package FirstPackage;

public class EncapMain {
	
	public static void main(String[] args) {
		Encap e= new Encap();
		e.setNumber(33);
		e.setName("mmmm");
		e.setPercentage(78.9f);
		
		
		System.out.println(e.getNumber());
		System.out.println(e.getPercentage());
	}
}
