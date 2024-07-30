package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arryalist_practice {

//	collection is framework provide by java
//	this framework provides many interfaces and their implemented classes in order to store grouph of objects in single entity
//array list the intial capcity after adding the element will be 10 .if we add 11th element the capacicty will be increased by 50%

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0.from array to arraylist
		Integer arr[]= {1,8,2,3,4};
		ArrayList <Integer> al=new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);

		//the defualt cappacity of arraylist before adding the element is "0". but after adding 10
		//where as vector is 10 at instence creation only
//1.adding the element
		al.add(7);
		al.add(17);
		al.add(7);
		System.out.println(al);
//2.removing the element
		al.remove(1);
		System.out.println(al);
//3.verification
		System.out.println(al.contains(17));
//4.update
		al.set(1, 17);
		System.out.println(al);
		
//5.retrive
		System.out.println(al.get(1));
		System.out.println(al.size());
		//in arraylist we can't see the capacity we only see the size
		
//advantages
		//arraylist is used to overcame the disadvantage from vector reg size
		//sycornize
		//we can use sycorize in arraylist by adding below method
		Collections.synchronizedList(al);


		


	}

}
