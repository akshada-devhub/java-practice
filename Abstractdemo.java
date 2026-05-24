abstract class Vehicle
{   
    int not; 
    abstract void tyres(int t);
	abstract void start();
}
class Scooter extends Vehicle
{
	void tyres(int t) 
	{
	  not = t;
      System.out.println("The no.of tyres is :"+not);
	}
	void start()
	{
	  System.out.println("The scooter is start by kick");
	}
}
class  Car extends Vehicle
{
	void tyres(int t) 
	{
	  not = t;
      System.out.println("The no.of tyres is :"+not);
	}
	void start()
	{
	  System.out.println("The car is start by key");
	}
}
class Abstractdemo
{
	public static void main(String s1[])
	{
      Scooter s = new Scooter();
      Car c = new Car();
      s.tyres(2);
      s.start();

      c.tyres(4);
      c.start();

     }
}