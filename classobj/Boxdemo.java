class Box
{
	private int length;
	private int breadth;
	private int height;
    void setdata(int l,int b,int h)
	{
     length=l;
     breadth=b;
     height=h;
	}
	void showdata()
	{
	 System.out.println("Box Dimensions\n");
	 System.out.println("height is = "+height);
	 System.out.println("length is = "+length);
	 System.out.println("breadth is = "+breadth);
	}
}
class Boxdemo
{ 
	public static void main(String[] args)
	{  
	Box smallbox=new Box();
	smallbox.setdata(22,12,32);
	smallbox.showdata();

	smallbox=new Box();
	smallbox.setdata(76,55,44);
	smallbox.showdata();
    }

}