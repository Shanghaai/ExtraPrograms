package addingConcept;

public class A 
{
	public void m1()
	{
		System.out.println("hi i am M1");
	}
	
	public void m2()
	{
		System.out.println("hi i am M2");
	}
}

class B extends  A
{
	public void m1()
	{
		System.out.println("hi i am over rided one of M1");
	}
}