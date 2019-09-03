package CallingFunctionPackage;

public class MyException1
{

	public static void main(String[] args) 
	{
		MyException ME=new MyException();
		
		try
		{
			
		ME.checkBalance();
		}
		catch(MyException M)
		{
			System.out.println(M);
		}

	}

}
