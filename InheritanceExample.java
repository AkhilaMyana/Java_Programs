package java_oops;

class Vehicle
{
	void color()
	{
		System.out.println("It is blue color");
	}
	void type()
	{
		System.out.println("We have different types of vehicles");
	}
}
class Car extends Vehicle
{
	void color()
	{
		System.out.println("car color is red");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		Car c= new Car();
		c.color();
		c.type();

	}

}
