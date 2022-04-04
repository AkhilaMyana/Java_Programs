package wiproproject;
class code
{
	void opr() throws ArithmeticException
	{
		int a=45,b=0,rs;
		if(b==0)
		{
			throw(new ArithmeticException("can't divide by zero"));
		}
		else
		{
			rs=a/b;
			System.out.println("Result: "+rs);
		}
		System.out.println("End of program");
	}
}
public class ThrowException {

	public static void main(String[] args) {
		code c = new code();
		try
		{
			c.opr();
		}
		catch(ArithmeticException e)
		{
			System.out.println("from main method error msg: "+e.getMessage());
		}
	}
}
