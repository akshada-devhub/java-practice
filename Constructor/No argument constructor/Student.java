import java.io.Console;
class Student
{
	String name;
	int rno;
	Console cn=System.console();
	Student()
	{
	 System.out.println("Enter the details : ");
     rno=Integer.parseInt(cn.readLine());
     name=cn.readLine();
	}
	void showdata()
	{
	 System.out.println("My name is = "+name);
	 System.out.println("My rollno is = "+rno);
	}
	public static void main(String args[])
	{
	 Student s1=new Student();
	 Student s2=new Student();
	 System.out.println("\nContent of s1 ");
	 s1.showdata();
	 System.out.println("\nContent of s2 ");
	 s2.showdata();
	}
}