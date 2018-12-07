class A
{
	static int x;
	int y;
	public static void main(String bb[])
	{
		int z=56;	// local variable, initialization of local
			//variable is compulsory before use
		System.out.println(x);	
		//System.out.println(y);
		A a=new A();
		System.out.println(a.y);
		System.out.println(z);
	}
}
