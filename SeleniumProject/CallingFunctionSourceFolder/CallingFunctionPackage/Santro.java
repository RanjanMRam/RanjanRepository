package CallingFunctionPackage;

public class Santro extends Car{

	Santro(int RegNo) {
		super(RegNo);
		
	}

	
	public void steering() 
	{
	 System.out.println("Apply Power Steering");
		
	}

	
	public void brakes()
	{
		System.out.println("Apply AntiBraking System");
		
	}

}
