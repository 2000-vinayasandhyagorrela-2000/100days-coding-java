package pattern3;

public class Pattern62 {
	public static void main(String[] args) {
		int n = 3;
		
		for(int i = n; i >= -n; i--)
		{
			for(int j=1; j <= Math.abs(i); j++) 
			  System.out.print(" ");			
			for(int k= n; k >= Math.abs(i); k--) 
				 System.out.print("* ");		
			System.out.println();		
		}
	} 
}
