import java.io.Console;
class Emp
{
	String post,name,dname;
	int empid;
	double sal,da,hra,ta,ts,td,gs,ns;
	Console cn=System.console();
	Emp(String nm,int id,double bs)
	{
      name=nm;
      empid=id;
      sal=bs;
      System.out.println("Enter the depart name:");
      dname=cn.readLine();
      System.out.println("Enter the post:");
      post=cn.readLine();
      da=80*sal/100;
      hra=40*sal/100;
      ta=12*sal/100;
      ts=10*sal/100;
      td=13*sal/100;
      gs=da+hra+sal+ta;
      ns=gs-td-ts;
      System.out.println("The name is "+name);
      System.out.println("Employee id "+empid);
      System.out.println("depart name "+dname);
      System.out.println("post of the employee "+post);
      System.out.println("The basic salary is "+sal);
      System.out.println("The gross salary is = "+gs);
      System.out.println("The net salary is = "+ns);

	}
}
class Empdemo
{
	public static void main(String args[])
	{ 
    System.out.println("\n\nEmployee no : 1");		
	Emp e1=new Emp("Akshada",6656,45000.00);
	System.out.println("\n\nEmployee no : 2");		
	Emp e2=new Emp("Siya",23434,78000.00);
    }
} 