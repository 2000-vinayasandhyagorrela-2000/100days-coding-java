package Formula;
import java.util.*;
public class Area_pentagon
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner (System.in);
	  System.out.println("enter side value:");
	  int s = sc.nextInt();
	  System.out.println("enter apothem length:");
	  int a = sc.nextInt();
	  float area = (float)(5/2)*s*a;
	  System.out.println("Area of pentagon = "+area);
	 }
}
