package Mathematics;
import java.util.*;
public class Lcm 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st numbers:");
	int n1 = sc.nextInt();
	System.out.println("enter 2nd numbers:");
	int n2 = sc.nextInt(); 
	int gcd = 1;
	for(int i = 1; i<=n1 && i<=n2;i++)
	{
		if(n1%i ==0 && n2%i ==0)
		{
			gcd = i;
		}
	}
     int lcm = (n1*n2)/gcd; 
	System.out.println("lcm is:"+lcm);
	}

}
