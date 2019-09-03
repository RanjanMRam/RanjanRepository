package CallingFunctionPackage;

public class ExceptionTest {
	
	public static void main(String[] args)
	{
		
		try
		{
			System.out.println("Open Files");
//			int n=args.length;
//			int a=45/n;
//			System.out.println("The value of a is "+a);
			int b[]= {10,20,30};
			b[50]=5000;
			
		}
		
	catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
		e.printStackTrace();
		System.out.println(e);
		System.out.println("Enter the Values in the arguments");
		}
		
		finally
		{
			System.out.println("CloseFiles");
		}
	}
	

}
