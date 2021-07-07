package Runners;

import java.util.concurrent.CountDownLatch;

public class RunnersMainNew {

	public static void main(String[] args) {
		
		CountDownLatch cdl = new CountDownLatch(2);
		
		RunnerNew runner1 = new RunnerNew(cdl);
		RunnerNew runner2 = new RunnerNew(cdl);
		
//		new RunnerNew(cdl);
//		new RunnerNew(cdl);
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (runner1.lenght > runner2.lenght) {
			System.out.println("Mike winner");
		} else {
			System.out.println("Bill winner");
		}
		System.out.println("FINISH");
	}

}
                 