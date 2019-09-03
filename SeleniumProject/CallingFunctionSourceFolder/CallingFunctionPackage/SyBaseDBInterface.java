package CallingFunctionPackage;

public class SyBaseDBInterface implements Inter{
	
	public void Connect() 
	{
		
		System.out.println("Connect to sybase Database");
	}

	public void Disconnect() 
	{
		System.out.println("disconnect from sybase Database");
		
	}
	public static void main(String[] args)
	{
		
	  sb.Connect();
	  sb.Disconnect();
	  or.Connect();
	  or.Disconnect();
	}

}
