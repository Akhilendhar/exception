package mon;

public class Membertest {
	int i = 30;

	class inner
	{
	void msg()
	{
		System.out.println(i);
	}
	}
	public static void main(String []args)
	{
		Membertest t=new Membertest();
		Membertest.inner t1=t.new inner();
		t1.msg();
	}
}
