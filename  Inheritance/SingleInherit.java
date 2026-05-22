class A
{
	void showA()
	{
	System.out.println("Hello this is class A");
	}
}
class B extends A
{
	void showB()
	{
	System.out.println("Hello this is class B");
	}
}
class SingleInherit
{
	public static void main(String args[])
	{
	A a=new A();
	a.showA();
	//a.showA()  error
	B b=new B();
	b.showA();
	b.showB();
	}
}