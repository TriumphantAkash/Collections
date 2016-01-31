//tutorial 09
package collections_handson;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesDemo {
	public static void main(String[] args) {
		
		// (head)<- oooooooooooooooooooooooo <-(tail)
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		//Throws no such element exception, when no element in the queue
		//System.out.println("head of the queue is : "+q1.element());
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("head of the queue is : "+q1.element());
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue");
			e.printStackTrace();
		}
		
		for (Integer val:q1){
			System.out.println(val);
		}
		
		//Integer value = q1.remove();	//removes the head of the queue and returns it
		System.out.println("removed element from the queue is : "+q1.remove());
		System.out.println("removed element from the queue is : "+q1.remove());
		System.out.println("removed element from the queue is : "+q1.remove());
		try {
			System.out.println("removed element from the queue is : "+q1.remove());
		} catch (Exception e) {
			System.out.println("trying to remove too many elements from the queue");
		}
		
		//////////////////////////////////////////////////////////////////// Another set of methods (returns special values)///////////////////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("queue 2 peek: "+ q2.peek());

		q2.offer(10);
		q2.offer(20);
		
		System.out.println("queue 2 peek: "+ q2.peek());
		
		if(q2.offer(30) == false) {
			System.out.println("third offer returns false");
		}
		
		for (Integer val:q2){
			System.out.println(val);
		}
		
		System.out.println("queue 2 poll "+ q2.poll());
		System.out.println("queue 2 poll "+ q2.poll());
		System.out.println("queue 2 poll "+ q2.poll());
	}
}
