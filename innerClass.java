package wiproproject;

public class innerClass {
	private String msg ="Welcome";
	class Inner{
	void hello()
	{
		System.out.println(msg+" to java");
	}
	}
	public static void main(String[] args) {
		innerClass obj = new innerClass();
		innerClass.Inner obj1 = obj.new Inner();
		obj1.hello();

	}

}
