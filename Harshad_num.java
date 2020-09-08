package numbers;
import java.util.*;
public class Harshad_num
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n = sc.nextInt(); //n = 18
		int sum =0;
		int c=n; 
		while(c>0) 
		{
		     int rem = c%10 ; 
		     sum = sum + rem ;
		     c= c/10 ;
		}
		if(n%sum==0)
		System.out.println("Harshad Number");
		else
		System.out.println("Not Harshad Number");
	} 
	}

