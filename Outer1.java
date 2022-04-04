package wiproproject;

public class Outer1 {
	private String msg ="Welcome";
	void display()
	{
		class Inner
		{
			void msg()
			{
				System.out.println(msg);
			}
		}
		Inner obj = new Inner();
		obj.msg();
	}
	public static void main(String[] args) {
		Outer1 obj1=new Outer1();
		obj1.display();

	}

}
