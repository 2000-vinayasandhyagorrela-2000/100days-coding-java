package pattern;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i='A'; i<='E';i++) 
		{
			for(int j= 'E';j>=i; j--) 
			{
				System.out.print((char)i+" ");
			}
			System.out.println();
		}
	}

}
