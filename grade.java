package wiproproject;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];
		float total=0;
		System.out.println("Enter your marks in 5 subjects:");
		for(int i=0;i<5;i++)
		{
			marks[i] = sc.nextInt();
			total = total+marks[i];
		}
		float avg= total/5;
		if(avg >= 90)
		{
			System.out.println("Grade: A+ Distinction ");
		}
		else if(avg>80 && avg<90)
		{
			System.out.println("Grade: A, First class with Distinction ");
		}
		else if(avg>65 && avg<80)
		{
			System.out.println("Grade: B+ ,First class ");
		}
		else if(avg>50 && avg<65)
		{
			System.out.println("Grade: B, Second class ");
		}
		else
		{
			System.out.println("Grade: C, Third class");
		}

	}

}
