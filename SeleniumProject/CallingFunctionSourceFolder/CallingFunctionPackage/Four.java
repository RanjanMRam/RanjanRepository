package CallingFunctionPackage;

public class Four {
	int j;
	Three T;
	
	Four(Three T)
	{
		this.T=T;
		j=20;
	}
	
	void display()
	{
		
		System.out.println("The value of j from Class Four is "+j);
		T.display();
		
	}

}
