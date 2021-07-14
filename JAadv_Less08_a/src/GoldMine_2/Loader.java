package GoldMine_2;

import java.util.concurrent.TimeUnit;

public class Loader implements Runnable{

	private MoneyHeap heap;
	private Cart cart;
	
	
	public Loader(MoneyHeap heap, Cart cart) {
		this.heap = heap;
		this.cart = cart;
	}

	@Override
	public void run() {
		while (heap.getQnt() >= 0) {
			try {
				cart.semaphore12.acquire();
				System.out.println("Dulin start digging");
				TimeUnit.SECONDS.sleep(2);
				heap.setQnt(heap.getQnt()-1);
				heap.setQnt(heap.getQnt()-1);
				heap.setQnt(heap.getQnt()-1);
				heap.setQnt(heap.getQnt()-1);
				heap.setQnt(heap.getQnt()-1);
				heap.setQnt(heap.getQnt()-1);
				cart.setCartCapacity(6);
				System.out.println("Ghimli! Cart is full!");
				System.out.println("Dulin relaxing...");
				cart.semaphore23.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hey Ho! Job done!");
	}
}
