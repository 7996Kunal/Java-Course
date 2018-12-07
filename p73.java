import java.util.*;
class p73
{
	public static void main(String[] bb)
	{
		Vector<String> lst=new Vector<>();
		lst.add("A1");
		lst.add("A2");
		lst.add("A3");
		lst.add(0,"A4");
		lst.add(0,"A5");
		lst.add(3,"A6");
		lst.add(2,"A7");
		lst.add(5,"A4");
		//A5,A4,A7,A1,A6,A4,A2,A3
		System.out.println(lst);
		System.out.println("Total Elements :"+lst.size());
		lst.remove(0);
		lst.remove(lst.size()-1);
		lst.remove("A1");
		//A4,A7,A6,A4,A2
		System.out.println(lst);
		System.out.println("Total Elements :"+lst.size());
		System.out.println(lst.contains("A5"));
		System.out.println(lst.contains("A6"));
		System.out.println();
		for(int i=0;i<lst.size();i++)
		{
			String s=lst.get(i);
			System.out.println(s);
		}
		System.out.println();
		for(String item:lst)
		{
			System.out.println(item);
		}
	}
}
