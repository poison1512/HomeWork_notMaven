package GoldMine_2;

import java.util.concurrent.TimeUnit;

public class Unloader implements Runnable{
	private Cart cart;
	private Bank bank;
	
	public Unloader(Bank bank, Cart cart) {
		this.bank = bank;
		this.cart = cart;
	}

	@Override
	public void run() {
		while (true) {
			try {
				cart.semaphore34.acquire();
				System.out.println("Balin start unloading cart");
				TimeUnit.SECONDS.sleep(3);
				cart.setCartCapacity(0);
				bank.setBqnt(bank.bqnt +1);
				bank.setBqnt(bank.bqnt +1);
				bank.setBqnt(bank.bqnt +1);
				bank.setBqnt(bank.bqnt +1);
				bank.setBqnt(bank.bqnt +1);
				bank.setBqnt(bank.bqnt +1);
				System.out.println("Ghimli! Cart is empty! Take it off!");
				cart.semaphore23.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
