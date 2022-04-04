package wiproproject;

import java.util.Scanner;

class set1
{
	void display1() throws ArithmeticException
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Arithmetic activity");
		System.out.println("Enter value1:");
		int n1=sc.nextInt();
		System.out.println("Enter value2:");
		int n2=sc.nextInt();
		int res=n1/n2;
		System.out.println("res:"+res);
		System.out.println("Arithmetic activity terminated");
	}
}
class set2
{
	void display2() throws ArithmeticException
	{
		set1 s1= new set1();
		s1.display1();
	}
}
class set3
{
	void display3() throws ArithmeticException
	{
		set2 s2= new set2();
		s2.display2();
	}
}

public class Example5 {

	public static void main(String[] args) {
		set3 s3= new set3();
		try {
		s3.display3();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in main class");
		}

	}

}
