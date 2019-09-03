package CallingFunctionPackage;

public class Cloning implements Cloneable {
	int EmpID;
	String Name;
	
	Cloning(int EmpID,String Name)
	{
	 this.EmpID=EmpID;
	 this.Name=Name;
	}
	
	public void getDetails()
	{
		System.out.println("Employee ID is "+EmpID);
		System.out.println("Name is "+Name);
	}
	public Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Cloning C1=new Cloning(260,"Ranjan");
		C1.getDetails();
		Cloning C2=(Cloning) C1.Clone();
//		C2.getDetails();
//		C1.EmpID=430;
//		C1.Name="Rajesh";
//	    C2=(Cloning) C1.Clone();
//		C2.getDetails();
		C2.EmpID=540;
		C2.Name="Rakesh";
		C1=(Cloning) C2.clone();
		C1.getDetails();
		

	}
}
