class Students
{
	String name="Akshada";
	int rollno=100;
	void showdata()
	{
	 System.out.println("My name is = "+name);
	 System.out.println("My roll no is = "+rollno);
	}
	public static void main(String args[])
	{
	 Students s1=new Students();
	 Students s2=new Students();
	 System.out.println("\nContent of Student s1 ");
	 s1.showdata();
	 System.out.println("\nContent of Student s2 ");
	 s2.showdata();
	}
}