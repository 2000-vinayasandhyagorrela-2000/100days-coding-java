package pattern2;

public class Patteern43 {
	public static void main(String[] args) {
		int n = 3;

		for(int i=n; i >= -n; i--) 
		{
		for(int j= Math.abs(i); j <= n ; j++)
		System.out.print(j+" ");  // *
					
		System.out.println();					
		}
	}
}
