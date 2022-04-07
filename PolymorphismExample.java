package java_oops;

class Plane
{
	 void takeoff()
	 {
		 System.out.println("plane tookoff");
	 }
	 void fly()
	 {
		 System.out.println("plane is flying");
	 }
	 void land()
	 {
		 System.out.println("plane landed");
	 }
}
class CargoPlane extends Plane
{
	void fly()
	{
		 System.out.println("Cargoplane is flying");
	}
}
class FighterPlane extends Plane
{
	void fly()
	{
		 System.out.println("Fighterplane is flying");
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp= new FighterPlane();
		Plane ref;
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		
	}

}
