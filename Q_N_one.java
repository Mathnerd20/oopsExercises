package E4_25MCCE28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Box {
	int length = 1;
	int width = 1;
	int height = 1;
	public Box(int l, int b, int h)
	{
		length = l;
		width = b;
		height = h;
	}
	public static boolean equals(Box b2, Box b1)
	{
		if((b1.length == b2.length) && (b1.height == b2.height) && (b1.width == b2.width))
			return true;
		return false;
	}
}

class Student{
	int Rollno;
	String Name;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	Student(int Rollno, String Name){
		this.Rollno = Rollno;
		this.Name = Name;
	}
	public static int sum(Student[] list) {
		int sum = 0;
		for (int j = 0; j < list.length; j++) {
			sum += list[j].Rollno;
		}
		return sum;
	}
	public static Student[] increment(Student[] list) {
		for (int j = 0; j < list.length; j++) {
			list[j].Rollno++;
		}
		return list;
	}
}

public class Q_N_one {
	public static long orial(long n) {
		long result;
		if(n == 1) return 1;
		result = n * orial(n-1);
		return result;
	}
	
	public static void main(String[] args)
	{
		Box a = new Box(2,3,4);
		Box b = new Box(3,4,5);
		System.out.println(Box.equals(a,b));
		System.out.println(orial(5));
		Student[] students = new Student[5];
		students[0] = new Student(28,"Akshay");
		students[1] = new Student(50,"Guru");
		students[2] = new Student(10,"Koushik");
		students[3] = new Student(19,"Anchit");
		students[4] = new Student(100,"Void");

		for (int j = 0; j < students.length; j++) {
			System.out.println(students[j].Name + " " + students[j].Rollno);
		}

		System.out.println("Sum of roll no is: " + Student.sum(students));
		System.out.println("\nNew List is:");
		Student[] updated = Student.increment(students);
		for (int j = 0; j < students.length; j++) {
			System.out.println(updated[j].Name + " " + updated[j].Rollno);
		}
		
		System.out.println("Checking status: \n");
		for (int j = 0; j < students.length; j++) {
			if(!Pattern.matches("[0-5][0-9]", students[j].Rollno + ""))
			{
				System.out.println(students[j].Name + " does not exist in class");
				break;
			}
		}
	}
}
