import java.util.*;
class Student
{
	String name;
}
class p69
{
	public static void main(String[] bb)
	{
		int[] arr={6,34,23,56,987,32};
		Student st=new Student();
		st.name="Abhay";
		Stack s=new Stack();
		/*
			void push(Object item)
			Object pop()
			Object peek()
			int size()
			boolean isEmpty()
		*/
		s.push(15);
		s.push(23.67);
		s.push('A');
		s.push("HELLO");
		s.push(67);
		s.push(st);
		s.push(arr);
		s.push("TOP ELEMENT");
		System.out.println(s);
		System.out.println("Total Elements :"+s.size());
		Object a1=s.pop();
		Object a2=s.pop();
		Object a3=s.pop();
		Object a4=s.pop();
		System.out.println(s);
		System.out.println("Total Elements :"+s.size());
		String s1=(String)a1;
		int[] s2=(int[])a2;
		Student s3=(Student)a3;
		int s4=(int)a4;
		System.out.println(s1.toLowerCase());
		System.out.println(s2.length);
		System.out.println(s3.name);
		System.out.println(s4*100);
	}
}
