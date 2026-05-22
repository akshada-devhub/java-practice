class Overloaddemo
{
	double r,a,b,h;
	int s;
	void area(double r)
	{
	this.r=r;
	a=3.14*Math.pow(r,2);
	System.out.println("Area of circle is = "+a);
	}
	void area(double b,double h)
	{
	this.b=b;
	this.h=h;
	a=(1.0/2.0)*b*h;
	System.out.println("Area of Rectangle  is = "+a);
	}
	void area(int s)
	{
	this.s=s;
	a=s*s;
	System.out.println("Area of Square is = "+a);
	}
	public static void main(String args[])
	{
	Overloaddemo a=new Overloaddemo();
	a.area(3.0);
	a.area(12,10);
	a.area(5);
	}
}
