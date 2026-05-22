class Studentss
{
	String name;
	int rollno;
	void showdata()
	{
	 System.out.println("My name is = "+name);
	 System.out.println("My roll no is = "+rollno);
	}
	public static void main(String args[])
	{
	 Students s1=new Students();
	 Students s2=new Students();
	 s1.name="Akshada";
	 s1.rollno=100;
	 s2.name="Sakshi";
	 s2.rollno=101;
	 System.out.println("\nContent of Student s1 ");
	 s1.showdata();
	 System.out.println("\nContent of Student s2 ");
	 s2.showdata();
	}
}