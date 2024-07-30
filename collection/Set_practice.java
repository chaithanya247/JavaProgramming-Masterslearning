package collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_practice {
	//set is data structure which stores the unique elements of the data and does not allow duplicate of data
	//no update concept either we removing or adding
	

	public static void main(String[] args) {
		// Hashset uses Hashmap->use Array of nodes(key,value)
		
	//Hashmap does't follow the insertion order while storing the data
		HashSet <Integer>hs=new HashSet<>(); 
		//or
		Set <Integer>s=new HashSet<>(); 
	//linkedHashset uses->linkedhashmap ->link of nodes(key,value)
	//linkedhashset follow the insertion order of element
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
	//Treeset use->Treemap->binary tree
	//treeset maintian the element in sorted order
		TreeSet<Integer>ts=new TreeSet<>();
		//since Treeset is arranged sorted format we have few addtional methods
		//first
		//last
		//pollfirst
		//polllast
		//subset-
		//descendingset()
		hs.add(10);
		hs.add(85);
		hs.add(2);
		hs.add(65);
		hs.add(65);
		System.out.println(hs);
		hs.remove(65);
		System.out.println(hs);
		System.out.println(hs.contains(65));
		
		//retriving the element
		//we not use index position so we use for each, iterators
		for(int i:hs) {
			System.out.println(i);
		}





		

		

	}

}
