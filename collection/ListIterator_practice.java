package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_practice {

	public static void main(String[] args) {
		// Listiterator is an interface
		//it is only applicable on list type collection
		//and for both legacy class-v1.0 +new class-v1.2
		//bi-directional, we can read and write
		ArrayList<Integer>al=new ArrayList<>();
		al.add(12);
		al.add(66);
		al.add(99);
		al.add(77);
		ListIterator<Integer>ll=al.listIterator();
		//forward order
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
		//below to reverse order
		System.out.println();
		while(ll.hasPrevious()) {
			System.out.println(ll.previous());
		}
		ll.remove();

	}

}
