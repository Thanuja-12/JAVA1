package com.tnsif.DayEight.queue;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();

		pq.add("Java");
		pq.add("CSS");
		pq.add("HTML");
		pq.add("Spring");
		pq.add("Angular");

		pq.add("Hibernate");

		System.out.println(pq);

		pq.remove();
		System.out.println(pq);
		/*
		 * pq.remove(); System.out.println(pq); pq.remove(); System.out.println(pq);
		 * pq.remove(); System.out.println(pq); pq.remove(); System.out.println(pq);
		 * pq.remove(); System.out.println(pq);
		 * 
		 * pq.remove("React"); System.out.println(pq);
		 */

		Iterator<String> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}

	}

}
