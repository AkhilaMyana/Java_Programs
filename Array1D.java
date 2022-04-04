package wiproproject;

import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int b[]= {10,20,30,40};
		System.out.println("Array elements are:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
