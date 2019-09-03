package CallingFunctionPackage;
import java.util.Vector;

public class MemoryEater
{
  public static void main(String[] args) throws InterruptedException
  {
    Vector v = new Vector();
    while (true)
    {
      byte b[] = new byte[1048576];
      v.add(b);
      Runtime rt = Runtime.getRuntime();
      System.out.println( "free memory: " + rt.freeMemory() );
      Thread.sleep(250);
    }
  }
}