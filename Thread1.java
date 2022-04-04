package wiproproject;

class threadc extends Thread
{
	public void run()
	{
		System.out.println("Thread class");
	}
}
class Thread1 {

	public static void main(String[] args) {
		threadc obj = new threadc();
		obj.start();
	}

}