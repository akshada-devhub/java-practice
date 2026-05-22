import.java.io.Console;
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
     name=con.readLine();
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
     Studentt sb=new Studentt("Akshada",100);
     sb.showdata();
     Studentt ab=new Studentt();
     sb.showdata();
     Studentt sb=new Studentt(ab);
     sb.showdata();
    }

}