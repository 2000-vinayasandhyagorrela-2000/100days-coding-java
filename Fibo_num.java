package Basic_programs;
import java.util.*;
public class Fibo_num
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("enter number");
	int n = sc.nextInt();
	
	int a=0,b=1,c=0;
	
	while(c<n)  
	{
		c=a+b; 
		a=b;  
		b=c;} 
     if (c==n)
    	 System.out.println("Fibonacci Number");
     else
    	 System.out.println("Not Fibonacci Number");	
	}
	
}
