package solids;
import java.util.*;
public class Rhombus_area
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner (System.in);
	  System.out.println("enter 1st diagonals :");
	  int d1 = sc.nextInt();
	  System.out.println("enter 2nd diagonals :");
	  int d2 = sc.nextInt();
	  double a = (1.0/2.0)*d1*d2;
	  System.out.println("Area of Rhombus : "+a);
	}
}
