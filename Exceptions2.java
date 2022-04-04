package wiproproject;

import java.util.Scanner;

class OverAgeException extends Exception
{
	public OverAgeException(String s)
	{
		System.out.println(s);
	}
}
class UnderAgeException extends Exception
{
	public String toString()
	{
		return "age is not sufficient";
	}
}
public class Exceptions2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>65)
		{
			OverAgeException over=new OverAgeException("Age exceeded");
			System.out.println(over.getMessage());
			
			
		}
		else if(age<18)
		{
			UnderAgeException under=new UnderAgeException();
			System.out.println(under.toString());
			}
		else
		{
				System.out.println("Suitable for alloting Driving License");
		}
	}
	

}
