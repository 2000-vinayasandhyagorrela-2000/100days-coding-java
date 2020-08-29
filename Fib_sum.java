package programs2;
import java.util.*;
public class Fib_sum 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number :");  
	int n = sc.nextInt();  
	int a=0, b=1, c= 0, sum=a+b; 
	for(int i=2; i<=n;i++)
	{
		c=a+b;
		sum = sum + c; 
		a=b;
		b=c;
	}	
System.out.println("sum of fibonacci upto given number: "+sum);
}
}
