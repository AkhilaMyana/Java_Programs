package java_oops;

abstract class Vehicles
{
	abstract void color();
	void type()
	{
		System.out.println("We have different types of vehicles");
	}
}
class Bike extends Vehicle
{
	void color()
	{
		System.out.println("Bike color is blue");
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		Bike b= new Bike();
		b.color();
		b.type();
	}

}
