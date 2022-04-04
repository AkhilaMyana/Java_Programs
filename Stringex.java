package wiproproject;

import java.util.Scanner;

public class Stringex {

	public static void main(String[] args) {
		String[] str = {"India","Australia","Europe"};
		boolean c=false;
		int n=0;
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<str.length;i++)
		{
			if(s.equals(str[i]))
			{
				n=i;
				c=true;
				break;
			}
		}
		if(c)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

	}

}
