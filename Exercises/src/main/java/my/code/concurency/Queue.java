package my.code.concurency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queue {
	private static final int NUM_OF_CONSUMER_THREADS = 5;
	private static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
	
	public static void consume() {
		System.out.println(Thread.currentThread().getName() + " Czekam");
		try {
			Integer value = queue.take();
			System.out.println(Thread.currentThread().getName() + " Wartoœæ: " + value);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * Zadanie: zastosowaæ kolejkê do komunikacji miêdzy producentami i
	 * konsumerami.
	 */
	public static void main(String[] args) {
		for(int i = 0; i< NUM_OF_CONSUMER_THREADS; i++){
			new Thread(Queue::consume).start();
		}

		for (int i = 0; i < NUM_OF_CONSUMER_THREADS * 5; ++i) {
			queue.add(i);
		}
	}

}