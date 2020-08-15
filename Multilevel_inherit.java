package pack1;
class Student3
{
	String name;
	int roll;
    Student3(String name , int rollno)  // constructor
    {
    	this.name = name;
    	roll = rollno;
    }
    void showStudent2()
    {
    	System.out.println("name = "+name+ " roll = "+roll);
    }
}

class Marks3 extends Student3
{
	int m1, m2;
	Marks3(String name,int rn,int m1,int m2)
	{
	  super(name,rn);
	  this.m1 = m1;
	  this.m2 = m2;
	}
	void showmarks()
	{
		System.out.println("m1 = "+m1+ " m2 = "+m2);
	}
}

class Result1 extends Marks2
{
	int m3, m4;
	Result1(String name,int rn, int m1, int m2,int m3,int m4)
	{
	  super(name,rn,m1,m2);
	  this.m3 = m3;
	  this.m4 = m4;
	}
	void showResult()
	{
		System.out.println("m3 = "+m3+ " m4 = "+m4);
	}
}
public class Multilevel_inherit
{
	public static void main(String[] args) 
	{	  
       Result1 a = new Result1("sandhya",11,78,89,56,67);
       a.showStudent2();
       a.showmarks();
       a.showResult();       
	}

}
