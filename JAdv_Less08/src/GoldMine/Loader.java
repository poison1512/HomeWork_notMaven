package GoldMine;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Loader implements Runnable{

	private MoneyHeap heap;
	private Cart cart;
	private Exchanger<Cart> exLoTr;
	
	public Loader(MoneyHeap heap, Cart cart, Exchanger<Cart> exLoTr) {
		this.heap = heap;
		this.cart = cart;
		this.exLoTr = exLoTr;
//		new Thread(this).start();
	}
	
	
	@Override
	public void run() {
		while (heap.getQnt() > 0) {
			try {
				System.out.println("Dulin start digging");
				TimeUnit.SECONDS.sleep(2);
				heap.setQnt(heap.getQnt()-6);
				System.out.println("Ghimli! Cart is full!");
				cart = exLoTr.exchange(cart);
				System.out.println("Dulin relaxing...");
				cart = exLoTr.exchange(null);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			if (heap.getQnt() == 0) {
//			}
		}
		System.out.println("Hey Ho! Job done!");
	}
}
