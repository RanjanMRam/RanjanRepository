package CallingFunctionPackage;

public class MultipleInheritanceInterface implements Father,Mother {


	public void GT() {
		System.out.println("Fuck In");
		
	}

	
	public void HT() {
		System.out.println("Fuckoff");
		
	}
	public static void main(String[] args)
	{
		MultipleInheritanceInterface MII=new MultipleInheritanceInterface();
		MII.HT();
		MII.GT();
			
	}

}
