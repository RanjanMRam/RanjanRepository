package CallingFunctionPackage;

public class UseCar {

	public static void main(String[] args) {
		Maruthi M=new Maruthi(2500);
		Santro S=new Santro(3600);
		M.openTank();
		M.steering();
		M.brakes();
		S.openTank();
		S.steering();
		S.brakes();
	}

}
