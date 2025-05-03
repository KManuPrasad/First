package FirstPackage;

  public class Access {
	
	private int a=1000;
	 final double d=99.99;
	protected float f=8.9f;
	public String s ="name";
	
	public static void main(String[] args) {
		
		Access obj =  new Access();
		System.out.println(obj.a);
	}
	

}
