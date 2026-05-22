import java.io.Console;
class QuaEqn
{
	public static void main(String s[])
	{
	int a,b,c;
	double r1,r2,dis,real,imag;
	Console cn=System.console();
	cn.printf("Enter the value of a,b,c\n");
	a=Integer.parseInt(cn.readLine());
	b=Integer.parseInt(cn.readLine());
	c=Integer.parseInt(cn.readLine());
    dis=b*b-4*a*c;
    cn.printf("The value of Discriminant is = %f ",dis);
    if(dis>0)
    {
     cn.printf("\nThe roots are real and Distinct");
     r1=(-b+Math.sqrt(dis))/((double)2*a);
     r2=(-b-Math.sqrt(dis))/((double)2*a);
     cn.printf("\nThe roots are :\nr1=  %f \nr2=  %f",r1,r2);
    }
    else
    {
      if(dis==0)
      {
       cn.printf("\nThe roots are real and Equal");
       r1=r2=-b/((double)2*a);
       cn.printf("\nThe roots are :\nr1=  %f \nr2=  %f",r1,r2);
      }
      else
      {
       cn.printf("\nThe roots are Imaginary");
       real=-b/((double)2*a);
       imag=Math.sqrt(-dis)/((double)2*a);
       cn.printf("\nThe roots are :\nr1=  %f+i%f \n",real,imag);
       cn.printf("\nThe roots are :\nr1=  %f-i%f \n",real,imag);
      }
    }
}

}