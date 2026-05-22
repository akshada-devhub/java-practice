class Student
{
	int rollno;
	String name;
	Student(int rn,String nm)
	{
     rollno=rn;
     name=nm;
	}
	void showdata()
	{
	System.out.println("My roll no is = "+rollno);
	System.out.println("My name is = "+name);
	}
	public static void main(String args[])
	{
	Student s1=new Student(100,"Akshada");
	Student s2=new Student(101,"Sakshi");
	
	System.out.println("\nContent of Student s1 ");
	s1.showdata();
	System.out.println("\nContent of Student s2 ");
	s2.showdata();
	}
}