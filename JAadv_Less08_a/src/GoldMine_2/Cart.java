package GoldMine_2;

import java.util.concurrent.Semaphore;

public class Cart {

	public int cartCapacity;
	public Semaphore semaphore12 = new Semaphore(1);
	public Semaphore semaphore23 = new Semaphore(0);
	public Semaphore semaphore34 = new Semaphore(0);
	
	public Cart(int cartCapacity) {
		this.cartCapacity = cartCapacity;
	}

	public int getCartCapacity() {
		return cartCapacity;
	}

	public void setCartCapacity(int cartCapacity) {
		this.cartCapacity = cartCapacity;
	}
	
	
}
