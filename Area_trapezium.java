package solids;
import java.util.*;
public class Area_trapezium
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st sides :");
	int a = sc.nextInt();
	System.out.println("enter 2nd side :");
	int b = sc.nextInt();
	System.out.println("enter height : ");
	int h = sc.nextInt();
	double area = (a+b) * (h) / 2.0;
System.out.println("Area of Trapezium : "+ area);
	} 
}
