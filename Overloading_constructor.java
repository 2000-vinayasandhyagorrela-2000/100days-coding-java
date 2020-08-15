package pack1;
class Bank
{
	String name;
	int acc_no;
	
	Bank()
	{
		name = "sandhya";
		acc_no = 13;
	}
	Bank(String name)
	{
		this.name = name;
		acc_no = 14;
	}
	Bank(String name , int acc_no)
	{
		this.name = name;
		this.acc_no = acc_no;
	}
	void showBank()
	{
System.out.println("name = "+name+"\nacc_no ="+acc_no);
	}
	
}
public class Overloading_constructor 
{
	public static void main(String[] args) 
	{
	  Bank b1 = new Bank();
	  b1.showBank();
	  Bank b2 = new Bank("navya");
	  b2.showBank();
	  Bank b3 = new Bank("siri",12);
	  b3.showBank();
	}
}
