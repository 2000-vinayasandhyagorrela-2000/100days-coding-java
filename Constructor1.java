package pack1;
class Student
{
	String name;
	int roll_no;
	
	Student(String name, int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	public void printStudent()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}	
}
public class Constructor1 
{
	public static void main(String[] args) 
	{
      Student s1 = new Student("sandhya",13);
      s1.printStudent();
	}

}
