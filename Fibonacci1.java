package Basic_programs;
import java.util.*;
public class Fibonacci1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number:");
	int n = sc.nextInt();  	
	int t1 = 0, t2 =1;
	System.out.println("Fibonacci Series:");
	for(int i = 1; i <= n ; i++)
	{
		int sum = t1 + t2;  
		t1 = t2;
		t2 = sum; 
		if(t1>0)
		{
			if(t1%2==0 && t1<n)
				System.out.print(t1+" ");
		}
	}	
}
}
