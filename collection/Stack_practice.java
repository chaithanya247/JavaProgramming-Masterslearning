package collection;

import java.util.Stack;

//stack extend the vector class
//stack,vector we have 100% increment
//stack is class in java which implements the list interface and extends the vector class and also represent the lifo principle
public class Stack_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in stack we can't specify size at intial only not like arraylist,vector
		//we only create empty stack
		Stack<String> books=new Stack<>();
		/*
		 * books.add("red"); books.add("green"); books.add(0,"yellow");
		 * System.out.println(books);
		 * 
		 * //update books.set(0, "orange"); System.out.println(books); //retrive
		 * System.out.println(books.get(0)); //remove books.remove("orange");
		 * books.clear(); System.out.println(books);
		 * System.out.println(books.contains("red"));
		 */
		
		//stack provide their won message to perform the operation->push,pop,peek,search
		
		books.push("yellow");
		books.push("red");
		books.push("green");
		books.push("white");
		books.push("orange");
		books.peek();//this peek method used for to see the last element in the stack only
		System.out.println(books);

		System.out.println(books);
		System.out.println(books.pop());
		System.out.println(books);
		System.out.println(books.search("white"));
		System.out.println(books.indexOf("white"));
		System.out.println(books.isEmpty());//this method from vector
		System.out.println(books.empty());//this method from stack


		







		



		

	}

}
