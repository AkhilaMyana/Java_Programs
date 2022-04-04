package wiproproject;
abstract class AnonymousInnerClass
{
	public abstract void display();
}
public class outer2 {

	public static void main(String[] args) {
		AnonymousInnerClass obj = new AnonymousInnerClass(){
			public void display()
			{
				System.out.println("Inner class");
			}
		};
		obj.display();
	}

}
