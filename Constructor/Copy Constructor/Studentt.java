import java.io.Console;
class Studentt
{
	String name;
	int rollno;
	Console cn=System.console();
    Studentt(String nm,int roll)
    {
     name=nm;
     rollno=roll;
    }
    Studentt()
    {
     name=cn.readLine();
     rollno=Integer.parseInt(cn.readLine());
    }
    Studentt(Studentt obj)
    {
    this.name=obj.name;
    rollno=Integer.parseInt(cn.readLine());
    }
    void showdata()
    {
    System.out.println("My name is = "+name);
    System.out.println("My rollno is = "+rollno);
    }
    public static void main(String args[])
    {
     Studentt s1=new Studentt("Akshada",100);
     s1.showdata();
     Studentt s2=new Studentt();
     s2.showdata();
     Studentt s3=new Studentt(s2);
     s3 .showdata();
    }

}