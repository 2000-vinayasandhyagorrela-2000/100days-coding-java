package solids;
import java.util.*;
public class Vol_hemisphere
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter radius :");
	 float r = sc.nextFloat();
	 double vol = (2.0/3.0)*(3.14)*(r*r*r);
System.out.println("Volume of Hemisphere : "+vol);
	} 
}
