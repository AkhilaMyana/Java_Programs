package ds;
import java.util.*;
public class namesexchange {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two names:");
		String name=sc.nextLine();
		String name1=sc.nextLine();
		int x=0,y=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='-')
			{
				x=i;
			}
			if(name1.charAt(i)=='-')
			{
				y=i;
			}
		}
		String str1=name.substring(0,x)+name1.substring(y);
		String str2=name1.substring(0,y)+name.substring(x);
		System.out.println(str1);
		System.out.println(str2);
	}

}
