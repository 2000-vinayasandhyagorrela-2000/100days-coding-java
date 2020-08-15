package pack1;

public class Static_variable {
	static int x =10;
	public static void main(String[] args) 
	{
	   Static_variable t1 = new Static_variable();
	   t1.x=50;
	   System.out.println(t1.x);  //50
	   
	   Static_variable t2 = new Static_variable();
	   System.out.println(t2.x);  //50  
	}

}
