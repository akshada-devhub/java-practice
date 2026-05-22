import java.io.Console;
class GreNo
{
	public static void main(String s[])
	{
	 int a,b,c;
	 Console cn=System.console();
	 cn.printf("Enter the any three nos:\n");
	 a=Integer.parseInt(cn.readLine());
	 b=Integer.parseInt(cn.readLine());
	 c=Integer.parseInt(cn.readLine());
	 if(a>b && a>c)
	 {
	  cn.printf("The no %d is Greater number",a);
	 }
	 else
	 {
	  if(b>a &&b>c)
	  {
	    cn.printf("The no %d is Greater number",b);
	  }
	  else
	  {
	   if(c>a && c>b)
	   {
	   cn.printf("The no %d is Greater number",c);
	   }
	   else
	   {
	    if(a==b && c==b)
	    {
	     cn.printf("The nos are equal");
	    }
	    else
	    {
	     cn.printf("The two nos are equal no single no is greater number");
	    }
	   }
	  }
	 }
	}
}