import java.util.*;
class p74
{
	public static void main(String[] bb)
	{
		HashSet<String> lst=new HashSet<>();
		lst.add("First");
		lst.add("Second");
		lst.add("Third");
		lst.add("A4");
		lst.add("Fourth");
		lst.add("A6");
		lst.add("Fifth");
		lst.add("A4");
		System.out.println(lst);
		System.out.println("Total Elements :"+lst.size());
		lst.remove(0);				// No Use
		lst.remove(lst.size()-1);	// No Use
		lst.remove("A4");
		System.out.println(lst);
		System.out.println("Total Elements :"+lst.size());
		System.out.println(lst.contains("First"));
		System.out.println(lst.contains("A4"));
		System.out.println();
		/*for(int i=0;i<lst.size();i++)
		{
			String s=lst.get(i);
			System.out.println(s);
		}*/
		System.out.println();
		for(String item:lst)
		{
			System.out.println(item);
		}
	}
}
