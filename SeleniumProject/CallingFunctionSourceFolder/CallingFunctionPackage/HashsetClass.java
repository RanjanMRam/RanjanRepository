package CallingFunctionPackage;

import java.util.HashSet;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashsetClass {
	
	

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
	    hs.add("USA");
	    hs.add("India");
	    hs.add("Germany");
	    hs.add("Poland");
	    hs.add("Australia");
	    
	    System.out.println("HashSet is "+hs);
	    System.out.println("Elements are");
	    ListIterator<String> it= (ListIterator<String>) hs.iterator();
	    while(it.hasNext())
	    {
	    	String s=(String) it.next();
	    	System.out.println(s);
	    }
	   

	}

}
