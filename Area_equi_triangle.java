package Formula;
import java.util.*;
public class Area_equi_triangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of a triangle:");
		float s = sc.nextFloat();		
		float a = (1.73f * s *s )/4;		
		System.out.println("Area of Equilateral Triangle = "+a);
	}

}
