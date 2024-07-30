package collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_practice {
	//map is the data structure which stores data in key value
	//it not work according to index like list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//same opertation if replace Hashtable to ->HashMap,LinkedHashMap,TreeMap
		Map<Integer,String> mp=new Hashtable<>();
		//or
		//Hashtable<Integer,String>ll=new Hashtable<>();
		
		//adding the element in map
		mp.put(101, "chaithanya");
		mp.put(102, "reddy");
		mp.put(103, "boomika");
		
		
		//1.Retrieval of keys from the map
		Set<Integer> keys=mp.keySet();
		for(int i:keys) {
			System.out.println(i);
		}
		
		//Retrieval of values from the map
		
		Collection<String> values=mp.values();
		for(String i:values) {
			System.out.println(i);
		}
		
		//retriving the value based on the key
		
		System.out.println(mp.get(103));
		
		//getting both key and value
		for(int i:keys) {
			System.out.println(i+">>>>>>"+mp.get(i));
			
		}
		//delection of element
		
		
//		mp.remove(103);
//		mp.remove(102, "reddy");
		System.out.println(mp);
		
		
		//verification of key
		
		mp.containsKey(101);
		mp.containsValue("chaithanya");
		
		//updating the element
		mp.put(103, "manohor reddy");
		mp.putIfAbsent(103, "hero");
		System.out.println(mp);
		System.out.println(mp.size());
		
		
		//2.we can retrive both values and keys using entry set or you can follow 1.
		
		Set<Entry<Integer,String>> e=mp.entrySet();
		for(Entry<Integer,String> ep:e) {
			Integer key=ep.getKey();
			String value=ep.getValue();
			System.out.println(key+">>>>>>"+value);
			
		}
		
		
		

		

		
		

		
		
		
		

	}

}
