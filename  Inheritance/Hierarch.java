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
class C extends A
{
  void showC()
  {
  	System.out.println("Hello this is class c");
  }
}
class Hierarch
{
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	C c=new C();
	
	a.showA();
	//a.showB error
	
	b.showA();
	b.showB();
    //a.showC error

    c.showA();
    c.showC();
    // c.showB();
	}
}