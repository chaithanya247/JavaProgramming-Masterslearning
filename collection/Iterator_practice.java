package collection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Iterator_practice {
	//iterator generally used for itteration of collection elements
	// iterator isused for all the class
	//legacy class +new class- v1.2
	//only we can access elements from one first->last , we cannot remove or add elements

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String>v=new Vector<>();
		v.add("apple");
		v.add("boy");
		v.add("mango");
		
		Iterator<String>e=v.iterator();
		//in iterator we have 2methods
		//e.hasnext()
		//e.next()
		//we can't add or update element using iterator but we can remove the elements

		while(e.hasNext()) {
			//e.remove();->we can use remove but we need use after next() ->only because it point to the element, after pointing only we need to remove
			System.out.println(e.next());
			e.remove();
		}
		System.out.println(v);
		
		//we can't directly access the "map" using iterator
		// we can apply iterator directly on on collection interface
		//to apply on map we need follow below method
		//to apply iterator on map, first we need to get values,key from the map and on the top we can apply the iterator
		
		HashMap<String,Integer>hm=new HashMap<>();
		hm.put("apples",89);
		hm.put("boys",00);
		hm.put("mangos",900);
		
		Iterator<String>mm=hm.keySet().iterator();
		while(mm.hasNext()) {
			//e.remove();->we can use remove but we need use after next() ->only because it point to the element, after pointing only we need to remove
			System.out.println(mm.next());}
		Iterator<Integer>nn=hm.values().iterator();
		while(nn.hasNext()) {
			//e.remove();->we can use remove but we need use after next() ->only because it point to the element, after pointing only we need to remove
			System.out.println(nn.next());}
		
		


	}

}
