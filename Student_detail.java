package pack1;
import java.util.*;
public class Student_detail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter sno");
		int sno =sc.nextInt();
		System.out.println("enter sname");
		String sname = sc.next();
		System.out.println("enter age");
		byte age= sc.nextByte();
		System.out.println("enter fee");
		float fee= sc.nextFloat();
	System.out.println(" sno = "+sno+"\n sname = "+sname+"\n age = "+age+"\n fee = "+fee);
	}
}
