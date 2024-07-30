package collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_practice {
//linkedlist access implement the both list,quee(deque)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//linkedlist we have 2types ->single linked list,double linked list
		//java uses only double linkedlist
		//we can create like this also from list->linkedList
		//or queee or Deque ->Linkedlist
//		List<Integer>ll=new LinkedList<Integer>();

		
		//there is no concept array in linked list
		//in linked list there is the node concept inside node there is ->prev node,data,next node
		//linkedlist can't be created with pre definned size
	
		LinkedList<String>ll= new LinkedList<>();
		ll.add("y1");
		ll.add("y2");
		ll.add(0, "tt");
		//using addall method we can add any collection to linkedlist
		ArrayList<String> aa=new ArrayList<>();
		aa.add("yyu");
		ll.addAll(aa);

		System.out.println(ll);
		
//remove
		ll.remove("yyu");
		System.out.println(ll);
//retrive
		System.out.println(ll.get(2));
		System.out.println(ll.contains("tt"));
//update
		ll.set(0,"rr");
		System.out.println(ll);




	}

}
