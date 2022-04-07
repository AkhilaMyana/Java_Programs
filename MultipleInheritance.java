package java_oops;

interface Calcy1
{
	void add();
}
interface Calcy2
{
	void sub();
}
class Calculator implements Calcy1,Calcy2
{
	public void add()
	{
		System.out.println("Inside add");
	}
	public void sub()
	{
		System.out.println("Inside sub");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add();
		obj.sub();
	}

}
