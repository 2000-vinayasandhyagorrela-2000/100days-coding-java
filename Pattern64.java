package pattern3;

public class Pattern64 {
	public static void main(String[] args) {
		int n = 4;
		int x=1;
		
		for(int i=n; i>= -n; i--)
		{
		  for(int j=1 ; j <= Math.abs(i); j++) 
			  System.out.print(" ");
		  x = 1;
		  for(int k= n; k>=Math.abs(i); k--) 
		  {
			  System.out.print(x+" ");
		      x=x+1; 
		  }
		  System.out.println();
		}
	} 
}
