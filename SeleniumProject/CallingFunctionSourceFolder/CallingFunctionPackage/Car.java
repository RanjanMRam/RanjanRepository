package CallingFunctionPackage;

public abstract class Car {
	
	int RegNo;
	Car(int RegNo)
	{
		this.RegNo=RegNo;
	}
	public void openTank()
	{
		System.out.println("Fill the fuel in the tank");
	}
	public abstract void steering();
	public abstract void brakes();
}

