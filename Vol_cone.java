package Formula;
import java.util.*;
public class Vol_cone
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter radius:");
	float r = sc.nextFloat();
	System.out.println("enter height:");
	int h = sc.nextInt();	
	double vol = 3.14 * (r*r)*h / 3;
System.out.println("Volume of cone = "+ vol);
	}


}
