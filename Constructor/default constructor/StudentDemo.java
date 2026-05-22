class StudentDemo
{
	int rollno;
	String name;
	void setdata(int rn,String nm)
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
	StudentDemo s1=new StudentDemo();
	StudentDemo s2=new StudentDemo();
	s1.setdata(100,"Akshada");
	s2.setdata(101,"Sakshi");
	System.out.println("\nContent of Student s1 ");
	s1.showdata();
	System.out.println("\nContent of Student s2 ");
	s2.showdata();
	}
}