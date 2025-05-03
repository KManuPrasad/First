package FirstPackage;

public class Arrays {
	public static void main (String args[])
	{
	String s[] = {"ss", "ddd", "sadsad"};
	char c[] = {'a', 'f','s','p'};
	c[2]= 'd';

System.out.println(s.length);
System.out.println(c.length);

	
	int [][]ma = {{1,4,6,7},{9,21,43,65,76}}; //max is [1][8]
//	System.out.println(ma [0][7]);
////	System.out.println(ma [0][7]);


	int i,j;
	for (i=0;i<=ma.length;i++)//rows
	{
	
		for(j=0;j<=4;j++)//cols
			System.out.print(ma[i][j]+" ");
		System.out.println();
		
	}
	
	//System.out.print(ma[1][1]);
	

	

}
}
