package wiproproject;

public class Myclass {

	public static void main(String[] args) {
		int[] array = new int[3];
		try
		{
			array[7]=3;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bounds");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("Array size: "+array.length);
		}

	}

}
