package Formula;
import java.util.*;
public class Area_octogon 
{
	public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter the length of a side :");
	  float s = sc.nextFloat();
	  float a = (float)(2*(1+Math.sqrt(2)) * s *s);
	  System.out.println("Area of Octagon = "+ a);
	}
}
