package FirstPackage;

public class Loops {
	public static void main(String args[]) {
	//int i=1;
//	while(i<=4)
//	{
//		System.out.println("*");
//		i++;
//		}
//	}
	
//	do {	
//		System.out.println("*");
//		i++;
//		}
//	while(i<=4);
		
		int i,j;
		  for (i = 0; i <= 5; i++) {
			  
	            // inner loop to handle columns
	            for (j = 0; j <= 8; j++) {
	                System.out.print("*");
	            }
	 
	            // printing new line for each row
	            System.out.println();
	        }
			
	
	}

}
