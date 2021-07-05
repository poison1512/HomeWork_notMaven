package Runners;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class RunnerNew implements Runnable {
	private CountDownLatch countDownLatch;
	private String name;
	int lenght = 0;
	
	public RunnerNew(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
		new Thread(this).start();
	}

//	public RunnerNew() {
//	}

	@Override
	public void run() {
		while(lenght < 20) {
			lenght += (int) (Math.random()*4);
			String way = "";

			for (int i = 0; i < lenght; i++) {
				way += "_";
			}
			System.out.println(name + ": " + way);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		countDownLatch.countDown();
	}
}