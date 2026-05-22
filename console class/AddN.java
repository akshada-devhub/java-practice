import java.io.Console;
class AddN
{
	public static void main(String s[])
	{
	 int a,b,c;
	 Console con=System.console();
	 con.printf("Enter the two nos :\n");
	 a=Integer.parseInt(con.readLine());
	 b=Integer.parseInt(con.readLine());
	 c=a+b;
	 con.printf("The addition is = %d",c);
	 
	}
}