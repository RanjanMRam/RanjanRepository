package CallingFunctionPackage;

public class C extends B
{
	public void C1()
	{
		System.out.println("C1 is called");
		super.A1();
	}
	
	public void C2()
	{
		System.out.println("C2 is called");
	}
	public void C3()
	{
		System.out.println("C3 is called");
	}
	public void C4()
	{
		System.out.println("C4 is called");
	}
	public void C5()
	{
		System.out.println("C5 is called");
	}


	public static void main(String[] args) {
	C c=new C();
	c.C1();

	}

}
