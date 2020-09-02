package numbers;
import java.util.*;
public class Mixed_num
{
public static void main(String args[])
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number :");
	int num = sc.nextInt();
     print(num);
	}  
   static void print(int num)
   {
	int f = 1;
	int n,d;
	n = num;  
	while(num!=0) 
	{ 
	  d = num%10;  
	  num = num/10; 
	  
	  if(n%2 == 0 &&  d%2 == 1)
	  {
		  f=2;
		  break;
	  }
	  else if(n%2 == 1 && d%2 == 0) 
	  {
		  f=2; 
		  break;
	  }
	}
		if(f ==1 && n%2 ==0)
		System.out.println(n+" is Full Even Number ");
	else if (f==1 && n%2==1)
		System.out.println(n+" is Full Odd Number ");
	else
		System.out.println(n+" is Mixed Number ");

}
}
