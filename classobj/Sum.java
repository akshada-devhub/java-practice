import java.io.Console;
class DigSum
{
	int x,num,sum;
	Console sc=System.console();
	void getdata()
	{
      sc.printf("Enter any nno:\n");
      num=Integer.parseInt(sc.readLine());
      x=num;
	}
	void cal()
	{
	 int i;
	 while(x>0)
	 {
	  i=x%10;
	  sum=sum+i;;
	  x=x/10;
	 }
	 sc.printf("Addition of all digits of no. %d is = %d",num,sum);
	}
}
class Sum
{
	public static void main(String args[])
	{
	 DigSum a=new DigSum();
	 a.getdata();
	 a.cal();
	}
}