package CallingFunctionPackage;

public class MyException extends Exception
{

	MyException()
	{
		
	}
	MyException(String str)
	{
		super(str);
	}
	
	
	 long acctno[]= {102345,542554,354258,245755,789456};
	 String name[]= {"Ramesh","Ganesh","Suresh","Satish","Nitesh"};
	 double bal[]= {10000.00,6000.00,7000.00,500.00,6500.00};
	 
	 public void checkBalance() throws MyException
	 {
		 
	 try
	 {
		 System.out.println("AccountNumber	Name	Balance");
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(acctno[i]+"	"+name[i]+"	"+bal[i]);
			 if(bal[i]<1000)
			 {
				//MyException ME=new MyException("Balance is less than 1000");
				throw new MyException("Balance is less than 1000");
				
			 }
			 
	     }
	 
	 }
	 catch(MyException ME)
	 {
		 
		throw ME;
	 }
	 
	 
	 
	 }	
	 
	 public static void main(String[] args) throws MyException
	 {
		 MyException M=new MyException();
		 M.checkBalance();
	 }
	
}
