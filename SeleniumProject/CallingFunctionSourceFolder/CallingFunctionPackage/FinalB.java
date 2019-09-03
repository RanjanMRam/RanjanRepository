package CallingFunctionPackage;

public class FinalB  {
	
	static void displayB()
	{
		FinalA.x=FinalA.x+2;
	}
	
	public static void main(String[] args) 
	{
		FinalA.displayA();
		FinalB.displayB();
		FinalA.displayA();
		System.out.println("Value of x from B is "+FinalA.x);
	}

}
