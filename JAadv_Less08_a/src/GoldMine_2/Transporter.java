package GoldMine_2;

import java.util.concurrent.TimeUnit;

public class Transporter implements Runnable{
	private Cart cart;
	
	public Transporter(Cart cart) {
		this.cart = cart;
	}

	@Override
	public void run() {
		while (true) {
			try {
				cart.semaphore23.acquire();
				System.out.println("Ghimli start driving cart FULL of gold --->");
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Balin! I'm here! Unload!");
				System.out.println("Ghimli relaxng...");
				cart.semaphore34.release();
				System.out.println("Ghimli start driving EMPTY cart to Dulin <---");
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Dulin! Load me!");
				cart.semaphore12.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
