package CallingFunctionPackage;

public class ADD {
	
  //static int a=10;
	
	ADD()
	{
		this(25);
		this.display();
	}
	private int x;	
//	private int y;
//  int b;
//static int a;
//static int b;
//	ADD(int x,int y)
//	{
//		a=x;
//		b=y;
//	}
	ADD(int x)
	{
		this.x=x;
	}
	
	 
void copy(int x)
	//static int sum()
	{
	this.x=x;
		
	}
	 void display()
	 {
	 System.out.println("The value is "+x);
	 
	 }
	

}
