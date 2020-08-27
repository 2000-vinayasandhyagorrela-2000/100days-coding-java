package programs2;
import java.util.*;
public class Mul_2_3
{
	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter 1st numbers:");
	  int s = obj.nextInt();
	  System.out.println("enter 2nd numbers:");
	  int n = obj.nextInt();
	  System.out.println("Multiples of 3 and 5 are:");
	  for(int i = s; i<= n ; i++)
	  {
		  if(i%3==0 && i%5 == 0)
			  System.out.print(i +" ");
	  }
}
}
