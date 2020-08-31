package solids;
import java.util.*;
public class Cuboid_vol
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner (System.in);
	  System.out.println("enter length :");
	  int l = sc.nextInt();
	  System.out.println("enter breadth :");
	  int b= sc.nextInt();
	  System.out.println("enter height :");
	  int h= sc.nextInt();
	  double vol= l*b*h;
	  System.out.println("volume of cuboid: "+vol);
	}
}
