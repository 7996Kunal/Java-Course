class A
{
	public static void main(String bb[])
	{
		float x=23.45F;
		double y;
		y=x;
		x=(float)y;	
		System.out.println(x);
		System.out.println(y);
		long w=3000000000L;
		int m=100,n=200,p=300;
		byte b1,b2,b3;
		b1=(byte)m;
		b2=(byte)n;
		b3=(byte)p;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
