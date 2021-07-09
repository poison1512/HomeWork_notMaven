package GoldMine;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GoldMain {

	public static void main(String[] args) {
		Cart cart =  new Cart(6);
		MoneyHeap heep = new MoneyHeap(100);
		Exchanger<Cart> exLoTr = new Exchanger<>();
		Exchanger<Cart> exTrUn = new Exchanger<>();
//		new Loader(heep, cart, exLoTr);
//		new Transporter(exLoTr, exTrUn);
//		new Unloader(exTrUn);
		ExecutorService srv = Executors.newFixedThreadPool(3);
		srv.execute(new Loader(heep, cart, exLoTr));
		srv.execute(new Transporter(exLoTr, exTrUn));
		srv.execute(new Unloader(exTrUn));
		srv.shutdown();
	}

}
  