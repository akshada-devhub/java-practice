class Boxdemo
{
	private int length,height,breadth;
	void setdata(int l,int h,int b)
	{
	 length=l;
	 height=h;
	 breadth=b;
	}
    void showdimen()
    {
     System.out.println("Box diamensions\n");
     System.out.println("Length is = "+length);
     System.out.println("Length is = "+breadth);
     System.out.println("Length is = "+height);
    }
}
class Box
{
	public static void main(String[] args)
	{
	 Boxdemo sb=new Boxdemo();
	 sb.setdata(22,33,44);
	 sb.showdimen();

	 Boxdemo jb=new Boxdemo();
	 jb.showdimen();

	}
}