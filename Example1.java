package wiproproject;
class MyException extends Exception
{
	String str1;
	MyException(String str2)
	{
		str1=str2;
	}
	public String toString()
	{
		return ("MyException occuredx: "+str1);
	}
}
public class Example1 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Starting of try block");
			throw new MyException("This is My Error Message");
		}
		catch(MyException exp)
		{
			System.out.println("catch block");
			System.out.println(exp);
		}
	}

}
