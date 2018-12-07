import java.util.*;
class p68
{
	public static void main(String[] bb)
	{
		Date d1=new Date();
		Date d2=new Date("12-Feb-2017");
		Date d3=new Date("12, February 2016 14:45:30");
		Date d4=new Date(118,0,15);// year,month,date
		Date d5=new Date(118,0,15,15,23,45);// year,month,date,hrs,min,seco
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		int a1=d1.getYear();
		int a2=d1.getMonth();
		int a3=d1.getDate();
		int a4=d1.getDay();
		int a5=d1.getHours();
		int a6=d1.getMinutes();
		int a7=d1.getSeconds();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		d1.setYear(-43);
		System.out.println(d1);
	}
}
