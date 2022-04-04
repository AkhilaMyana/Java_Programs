package wiproproject;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try
		{
			System.out.println("Array activity");
			System.out.println("Enter size of array: ");
			int n= sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the position to insert element: ");
			int pos = sc.nextInt();
			System.out.println("Enter element to be inserted:");
			int x=sc.nextInt();
			arr[pos]=x;
			System.out.println("End of Array activity");
			System.out.println("Object  activity");
			demo obj= new demo();
			obj.display();
			obj=null;
			obj.display();
			System.out.println("end of object activity");
			System.out.println("Arithmetic activity");
			System.out.println("Enter value1:");
			int n1=sc.nextInt();
			System.out.println("Enter value2:");
			int n2=sc.nextInt();
			int res=n1/n2;
			System.out.println("res:"+res);
			System.out.println("Arithmetic activity terminated");
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException | NullPointerException e1)
		{
			System.out.println("runtime Exception found ");
		}
	}
}
