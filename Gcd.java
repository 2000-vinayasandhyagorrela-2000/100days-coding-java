package Mathematics;
import java.util.*;
public class Gcd
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter 1st numbers:");
	  int n1 =sc.nextInt();  
	  System.out.println("enter 2nd numbers:");
	  int n2 = sc.nextInt(); 
	  int gcd = 1;
	  
	  for(int i =1; i<=n1 && i<=n2; i++ )
	  {
		  if(n1%i==0  && n2%i==0)
			  gcd = i; 
	  }
	  System.out.println("GCD = "+ gcd);
	} 
}
