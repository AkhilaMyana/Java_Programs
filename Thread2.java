package wiproproject;

class thread implements Runnable
{
	public void run()
	{
		System.out.println("Thread class");
	}
}
public class Thread2 {

	public static void main(String[] args) {
		thread t = new thread();
		Thread obj = new Thread(t);
		obj.start();
	}

}
