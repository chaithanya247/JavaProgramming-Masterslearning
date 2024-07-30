package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueue_practice {

	public static void main(String[] args) {
		// priority queue
		//defualt size of priority queue is "11"
		
		//creation priority queue->retriving elements based upon priority not fifo
		
		
		PriorityQueue<Integer>pp=new PriorityQueue<>();
		
		//if you want reverse order ->giving priority to highest number
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());

		//note
		//addition-offer,add
		//retrieval-peek
		//Removal-poll,remove
		
		//addition
		pq.offer(2);
		pq.add(16);
		pq.offer(1);
		pq.add(7);
		//priortyqueue does't give the sorted elements
		//but head node point to the highest priority that means small number
		//highest priority first out
		
		System.out.println(pq);

		//peek is only retrive the head only
		System.out.println(pq.peek());
		System.out.println(pq);
		
		//retrive the elements from priority queue
		//we don't use for-each loop it will misbehave the behavour of priority queue
		//so we use the below while loop
		/*
		 * while(!pq.isEmpty()) { System.out.println(pq.poll()); }
		 */
				
		
		//poll remove the head node
		System.out.println(pq.poll());
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove(19));
		System.out.println(pq);
		
		//verify
		System.out.println(pq.contains(16));
		
		
		//retrive the elements from priority queue
		//we don't use for-each loop it will misbehave the behavour of priority queue
		//so we use the below while loop
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		




		



	}

}
