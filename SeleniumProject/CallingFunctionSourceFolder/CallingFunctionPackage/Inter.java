package CallingFunctionPackage;

public interface Inter {
	void Connect();
	void Disconnect();
	SyBaseDBInterface sb=new SyBaseDBInterface();
	OracleDBInterface or=new OracleDBInterface();

}
