package wiproproject;
	import java.util.Scanner;
	class get
	{
		
		void display1() throws ArithmeticException
		{
			System.out.println("display started");
			try 
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
			catch(Exception e)
			{
				System.out.println("Exception handled");
				throw e;
			}
			finally
			{
				System.out.println("Display terminated");
			}
		}
		
		
	}
	public class Example6 {
	
		public static void main(String[] args) {
			System.out.println("Main started");
			get s1 = new get();
			try
			{
				s1.display1();
			}
			catch(Exception e)
			{
				System.out.println("Exception handled in main");
			}
			System.out.println("main terminated");
		}
	
	}
