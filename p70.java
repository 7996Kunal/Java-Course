import java.util.*;
class p70
{
	public static void main(String[] bb)
	{
		//Stack<Student> s=new Stack<>();
		//Stack<Integer> s=new Stack<>();
		//Stack<int[]> s=new Stack<int[]>();
		//Stack<int[]> s=new Stack<>();
		Stack<String> s=new Stack<>();
		/*
			void push(String item)
			String pop()
			String peek()
			int size()
			boolean isEmpty()
		*/
		s.push("ABC");
		s.push("A1");
		s.push("A2");
		s.push("HELLO");
		s.push("A4");
		s.push("TOP ELEMENT");
		System.out.println(s);
		System.out.println("Total Elements :"+s.size());
		String s1=s.pop();
	}
}
