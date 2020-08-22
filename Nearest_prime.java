package Mathematics;
import java.util.*;
public class Nearest_prime
{
	boolean isPrime(int n)  
	{
		int c=0;
		for(int i=2; i<n; i++) 
		{
			if(n%i == 0)  
				c++; 
		}
		if (c==0)
			return true; 
		else
			return false; 
	}
	
	int beforePrime(int n)  
	{
		int c=0;
		while(true)
		{
			if(isPrime(n))    
				return c;   
			else
			{
				n = n-1;  
				c++;  
			}
				
		}
	}
	
	int afterPrime(int n)  
	{
		int c=0;
		while(true)
		{
			if(isPrime(n))  
				return c; 
			else
			{
				n = n+1; 
				c++; 
			}
		}
	}
	
	void nearestPrimes()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number:");
		int n = obj.nextInt();  
	    int m1 = beforePrime(n);  
	    int m2 = afterPrime(n);  
	    if(m1>m2)  
	    {
	    	System.out.println("Nearest prime:");
	    	System.out.println(n+m2);
	    }
	    else if(m2>m1)  
	    {
	    	System.out.println("Nearest prime:");
	    System.out.println(n-m1);  
	    }
	    else
	    {
	    	System.out.println("Nearest primes are:");
		    System.out.println((n-m1)+" "+(n+m2));
	    }   
	    
	}	
	
	
	public static void main(String[] args) 
	{
	Nearest_prime obj = new Nearest_prime();
	obj.nearestPrimes();
	

	}
}
