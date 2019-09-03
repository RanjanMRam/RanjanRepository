package CallingFunctionPackage;

public class Compare {
	void comp()
	{
	A_Poly A1=new A_Poly();
	A_Poly A2=new A_Poly();
	Integer N1=new Integer(15);
	Integer N2=new Integer(15);
	//String D=N1.getClass().getName();
	System.out.println("Class name is "+N1.getClass().getName());
	if(A1.equals(A2))
	{
		System.out.println("Objects are same");
	}
	else
	{
		System.out.println("Objects are not same");
	}
	if(N1.equals(N2))
	{
		System.out.println("Objects are same");
	}
	else
	{
		System.out.println("Objects are not same");
	}
	}
	
	public static void main(String[] args) 
{
	Compare C=new Compare();
	C.comp();
	Class name=C.getClass();
	String S=name.getName();
	System.out.println("Class name is "+S);
}
	
}
