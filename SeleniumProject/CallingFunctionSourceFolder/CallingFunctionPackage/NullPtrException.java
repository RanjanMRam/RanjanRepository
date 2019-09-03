package CallingFunctionPackage;

public class NullPtrException {
	public void demo()
	{
	try
	{
		System.out.println("Start");
		throw new NullPointerException(); 
		
	}
catch(NullPointerException ne)
	{
	ne.printStackTrace();
	//System.out.println(ne);
	}
	}
	
	public static void main(String[] args) 
	{
		NullPtrException npe=new NullPtrException();
		npe.demo();

	}

}
