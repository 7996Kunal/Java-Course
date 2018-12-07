class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("I="+i);
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int j=11;j<=20;j++)
		{
			System.out.println("j="+j);
		}
	}
}
class p97
{
	public static void main(String[] ar)
	{
		Thread1 t1=new Thread1();
		Thread t2=new Thread(new Thread2());
		System.out.println("Start 1");
		t1.start();
		System.out.println("Start 2");
		t2.start();
		System.out.println("End");
	}
}