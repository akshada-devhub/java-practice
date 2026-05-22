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
class C extends B
{
  void showC()
  {
  	System.out.println("Hello this is class c");
  }
}
class Multilevel
{
	public static void main(String args[])
	{
	A a=new A();
	B b=new B();
	C c=new C();
	
	a.showA();
	//a.showB and a.showC() error
	
	b.showA();
	b.showB();
    //b.showC error

    c.showA();
    c.showB();
    c.showC();
    
	}
}