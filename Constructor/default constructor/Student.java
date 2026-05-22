class Student
{
	String name;
	int rollno;
	void showdata()
	{
	System.out.println("My name is = "+name);
	System.out.println("My Roll no is = "+rollno);
	}
    public static void main(String args[])
    {
     Student s1=new Student();
     Student s2=new Student();
     System.out.println("\ncontent of Student s1 ");
     s1.showdata();
     System.out.println("\ncontent of Student s2 ");
     s2.showdata();
    }
}
