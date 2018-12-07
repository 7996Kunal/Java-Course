import java.util.*;
class p76
{
	public static void main(String[] bb)
	{
		String str="A Quick brown fox jumps over the lazy dog";
		/*
		String[] arr=str.split("ou"); // Split on "ou"
		for(String item:arr)
		{
			System.out.println(item);
		}*/
		StringTokenizer tokens=new StringTokenizer(str,"ou"); // either 'o' or 'u'
		/*
			String nextToken()
			boolean hasMoreToken()
		*/
		while(tokens.hasMoreTokens())
		{
			String s=tokens.nextToken();
			System.out.println(s);
		}
	}
}
