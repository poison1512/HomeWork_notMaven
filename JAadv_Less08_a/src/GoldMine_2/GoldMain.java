package GoldMine_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GoldMain {

	public static void main(String[] args) {
		Cart cart =  new Cart(0);
		MoneyHeap heep = new MoneyHeap(100);
		Bank bank = new Bank(0);
		ExecutorService srv = Executors.newFixedThreadPool(3);
		srv.execute(new Loader(heep, cart));
		srv.execute(new Transporter(cart));
		srv.execute(new Unloader(bank, cart));
		if (bank.bqnt == 100){
			srv.shutdown();
		}
	}

}
  