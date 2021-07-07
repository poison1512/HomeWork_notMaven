package GoldMine;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Transporter implements Runnable{
	private Cart cart;
	private Exchanger<Cart> exLoTr;
	private Exchanger<Cart> exTrUn;
	
	public Transporter(Exchanger<Cart> exLoTr, Exchanger<Cart> exTrUn) {
		this.exLoTr = exLoTr;
		this.exTrUn = exTrUn;
//		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				cart = exLoTr.exchange(null);
				System.out.println("Ghimli start driving cart FULL of gold --->");
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Balin! I'm here! Unload!");
				cart = exTrUn.exchange(cart);
				System.out.println("Ghimli relaxng...");
				cart = exTrUn.exchange(null);
				System.out.println("Ghimli start driving EMPTY cart to Dulin <---");
				TimeUnit.SECONDS.sleep(5);
				System.out.println("Dulin! Load me!");
				cart = exLoTr.exchange(cart);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
