package numbers;
import java.util.*;
public class Collartz
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nember");
		int n=sc.nextInt();
		int even=n/2;
		int odd=(3*n)+1;
		while(n!=1)
			if(n%2==0)
			{
				System.out.print(n+" ");
				even=n/2;
				n=even;
			}
			else if(n%2!=0)
			{
				System.out.print(n+" ");
				odd=(3*n)+1;
				n=odd;
			}
System.out.println(n+" ");
	}

}