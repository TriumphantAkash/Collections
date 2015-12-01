package collections_handson;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEample {

	public static void main(String[] args) {
		// (head) <- 000000000000000000000000000000 <- (tail) FIFO
		//fixed size
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		//gonna throw an exception (NoSuchELementException)
		//note: it we had used peek(), it would not have thrown exception
		//q1.element();
		
		//unlimited size
		//Queue<Integer> q2 = new LinkedList<Integer>();
		
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		try {
			q1.add(40);
		}catch (IllegalStateException e){
			System.out.println("Try to add more than the capacity");
		}
		
		for(Integer i:q1){
			System.out.println(i);
		}
		
		System.out.println("Head of the queue is:"+q1.element());
		
		//REMOVE
		
		q1.remove();
		System.out.println();
		for(Integer i:q1){
			System.out.println(i);
		}
		//////////////////////////////////////////
		//offer(), polll() and peak() methods
		System.out.println();
		Queue<Integer>q2 = new ArrayBlockingQueue<>(2);
		
		//peek to get the element on peak() (just like element())
		System.out.println("Queue 2 peek: "+q2.peek());
		
		//offer to add items
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		
		for(Integer i:q2){
			System.out.println(i);
		}
		
		//poll to remove items from the queue
		System.out.println("queue 2 poll: "+q2.poll());
		System.out.println("queue 2 poll: "+q2.poll());
		System.out.println("queue 2 poll: "+q2.poll());
		
		
		
		
	}

}
