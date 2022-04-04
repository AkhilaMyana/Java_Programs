package wiproproject;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition "+"2. Subtraction "+"3. Multiplication "+"4. Division ");
		System.out.println("Enter your choice:");
		int n=sc.nextInt();
		System.out.println("Enter any 2 number to perform operation:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		switch(n)
		{
		case 1: int add=a+b;
				System.out.println(add);
				break;
		case 2: int sub=a-b;
				System.out.println(sub);
				break;
		case 3: int mul=a*b;
				System.out.println(mul);
				break;
		case 4: int div=a/b;
				System.out.println(div);
				break;
		default:System.out.println("Enter valid input ");
				break;
		}
	}
}
		
			
		
		
		

	


