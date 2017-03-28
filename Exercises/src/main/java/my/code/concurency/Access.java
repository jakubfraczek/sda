package my.code.concurency;

import java.util.concurrent.atomic.AtomicInteger;

public class Access {

	private static AtomicInteger accumulator = new AtomicInteger(0);

	private synchronized static void add() {
		accumulator.incrementAndGet();
		System.err.println(accumulator);
	}

	/**
	 * Zadanie: Zastosowaæ jeden z mechanizmów synchronizacji, by otrzymaæ
	 * przewidywalny wynik
	 */
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 40; ++i) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					add();
				}
			}).start();
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					add();
				}
			}).start();
		}
		Thread.sleep(1000);
		System.out.println(accumulator);
	}

}