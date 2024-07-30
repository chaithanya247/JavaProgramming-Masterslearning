package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerator_practice {

	public static void main(String[] args) {
		//enumerater generally used for itteration of collection elements
		// Enumerator was interface and it performed on legacy class(v.1.0)->vector,stack,dictionary,properties,Hashtable
		//rest everthing is new class- v1.2
		//only we can access elements from one first->last , we cannot remove or add elements
		
		Vector<String>v=new Vector<>();
		v.add("apple");
		v.add("boy");
		v.add("mango");
		
		Enumeration<String>e=v.elements();
		//in Enumerator we have 2methods
		//e.hasmoreelements()
		//e.nextElement()

		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
