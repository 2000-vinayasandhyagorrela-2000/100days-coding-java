package solids;
import java.util.*;
public class Area_quadrilateral
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 4 sides :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int sp = (a+b+c+d)/2;
	double area = Math.sqrt((sp-a) * (sp-b) *(sp-c)*(sp-d));
	System.out.println("Area of Quadrilateral :12 "+ area);
	}
}