import java.io.*;
class p101
{
	public static void main(String[] ar)
	{
		try{
			//FileInputStream fin=new FileInputStream("p1.java");
			FileInputStream fin=new FileInputStream("d:/web/b1.jpg");
			int a=fin.read();
			while(a>=0)
			{
				System.out.print((char)a);
				a=fin.read();
			}
		}catch(Exception ee){}

	}
}