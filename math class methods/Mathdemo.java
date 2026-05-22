class Mathdemo
{
	public static void main(String[] args)
	{
	 double x=180;
	 double rad180=x*Math.PI/180;
	 System.out.println("RAdian angle of 180 is="+rad180);
	 double cos180=Math.cos(rad180);
	 System.out.println("Radian angle of cos180 is "+cos180);
	 double ai=Math.acos(cos180);
	 System.out.println("Inverse of  "+cos180+"is "+ai);
	 double deg=ai*180/Math.PI;
	 System.out.println("Now the cos inverse of -1 is (in degree)"+deg);

	}
}