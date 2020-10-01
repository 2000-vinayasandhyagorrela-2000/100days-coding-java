package pattern;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i='E'; i>='A';i--) 
		{
			for(int j= 'A';j<=i; j++) 
			{
				System.out.print((char)i+" "); 
			}
			System.out.println(); 
		}
	}

}
