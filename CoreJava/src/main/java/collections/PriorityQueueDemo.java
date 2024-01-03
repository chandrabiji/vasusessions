package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(300);
		pq.add(200);
//		pq.add("Chandra");
//		pq.add('B');
//		pq.add(true);
//		pq.add(89.34);
//		pq.add(null);
		System.out.println("PriorityQueue Elements are: "+pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);

	}

}
