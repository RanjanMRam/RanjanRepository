package CallingFunctionPackage;

interface I
{
 public void testA();
public void testB();
}

public abstract class AbstractEx implements I
{
	public void sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum="+sum);
	}
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
	public void testA()
	{
		System.out.println("testA()");
		
	}
	public void testB()
	{
		
		System.out.println("testB()");
		
	}
	
	}
