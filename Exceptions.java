package wiproproject;

public class Exceptions {

	public static void main(String[] args) {
		int a=4,b=2,result;
		try
		{ 
			if(b==0)
			{
				throw (new ArithmeticException ("can not divide by zero"));
			}
			else
			{
				result=a/b;
				System.out.println(result);
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
