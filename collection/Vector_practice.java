package collection;

import java.util.Arrays;
import java.util.Vector;
//or
//import java.util.*;
//collection concept is to overcome disadvantage of arrays
//vector same like array initialy it as capacity 10 
//if we try to add 11th element then the capcity increased by 100% exammple:10->20;30->60

public class Vector_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.creation of list
		Vector v1 =new Vector();
		//Vector v1=new Vector(66); //we can spicify size like this also
		v1.add("chai");
		v1.add("reddy");
		v1.add("t");
		v1.add(0,"hero");
		v1.add("ff");
		v1.add("fyyg");
		v1.add("fkjhkf");
		v1.add("fkjljf");
		v1.add("fdttf");
		v1.add("fuyutuuf");
		v1.add(10,"hh");

		
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
//2.addition of list
		//adding to list in 2 diff ways
		Vector obj1=new Vector();
		obj1.add("chaithanya");
		obj1.add("reddy");
		Vector obj2=new Vector();
		obj2.add("manohar");
		obj2.add("reddy");
		
		//way1
		//obj1.addAll(obj2);
		//System.out.println(obj1);
		//obj1.addAll(0, obj2);
		//System.out.println(obj1);

//		obj1.addAll(1, obj2);
//		System.out.println(obj1);
		
		//way2
		for(int i=0;i<obj2.size();i++) {
			obj1.add(obj2.get(i));
		}
		System.out.println(obj1);
//3.retrival of element from the list
		System.out.println(obj1.get(2));
		
//4.Deletion of list
//		obj1.remove(0);
//		obj1.remove("reddy");
//		obj1.remove("reddy");
//		obj1.removeAll(obj2);//remove all will remove enter obj2 and common element in obj1 also
		//obj2.clear();
		System.out.println(obj2);
		
//5.verification of the list
		System.out.println(obj1);
		System.out.println(obj2);

		System.out.println(obj1.contains("reddyj"));
		System.out.println(obj1.containsAll(obj2));
		
//6.update of the list
		obj1.set(0, "Dhoni");
		System.out.println(obj1.get(0));
		System.out.println(obj1);
		System.out.println(obj1.lastIndexOf("reddy"));
		
		
//converting vector to array
		Object[] arr=obj1.toArray();
		System.out.println(Arrays.toString(arr));
		
//we can use array element in list from the below way
		Object arr1 []= new Object[] {1,2,3,4};
		Vector n=new Vector(Arrays.asList(arr1));
		//when we take the element from array to vector the size will be same as array size not defualt intial size of vector =10
		System.out.println(n.size());
		System.out.println(n.capacity());
		
//generic helps the user to store single data type value like interger,string..we use datatype names as Wrapper class only
		Vector<Integer> v3=new Vector<Integer>();
		




		



		

	}

}
