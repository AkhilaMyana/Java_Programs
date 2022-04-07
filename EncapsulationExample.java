package java_oops;

class House
{
	private String color;
	private int cost;
	private String type;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public House(String color, int cost, String type) {
		super();
		this.color = color;
		this.cost = cost;
		this.type = type;
	}
	public String toString()
	{
		return getType()+" "+getColor()+" "+getCost();
	}
}
public class EncapsulationExample {

	public static void main(String[] args) {
		House obj = new House("Blue",25000,"Villa");
		System.out.println(obj.toString());
		obj.setColor("black");
		obj.setCost(30000);
		System.out.println(obj.toString());
		System.out.println(obj.getColor());
		System.out.println(obj.getCost());
		
	}

}
