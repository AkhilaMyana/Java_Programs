package wiproproject;

class different
{
	int add(int a,int b)
	{
		return a+b;
	}
	String name(String name)
	{
		return name;
	}
	double price(double n)
	{
		return n;
	}
	float avg(float a)
	{
		return a;
	}
}
public class diffMethod {

	public static void main(String[] args) {
		different obj = new different();
		int sum=obj.add(2, 5);
		String s=obj.name("sana");
		double cost=obj.price(60);
		float grade=obj.avg(54);
		System.out.println("sum:"+sum+" Name:"+s+" cost:"+cost+" grade:"+grade);
	}

}
