package CallingFunctionPackage;

public class B_Poly extends A_Poly {
	
	void calculate(int x)
	{
		System.out.println("Calculation is "+x*x*x);
		
	}

	public static void main(String[] args) 
	{
		B_Poly a=new B_Poly();
		a.calculate(5);
		

	}

}
