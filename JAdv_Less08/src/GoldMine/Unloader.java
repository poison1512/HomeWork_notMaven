package GoldMine;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Unloader implements Runnable{
	private Cart cart;
	private Exchanger<Cart> exTrUn;
	
	public Unloader(Exchanger<Cart> exTrUn) {
		this.exTrUn = exTrUn;
//		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				cart = exTrUn.exchange(null);
				System.out.println("Balin start unloading cart");
				TimeUnit.SECONDS.sleep(3);
				System.out.println("Ghimli! Cart is empty! Take it off!");
				cart = exTrUn.exchange(cart);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
