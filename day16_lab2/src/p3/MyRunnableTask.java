package p3;

public class MyRunnableTask implements Runnable {

	

	@Override
	public void run() {
		System.out.println("strted exec " + Thread.currentThread().getName());
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("thrd " + Thread.currentThread().getName() + " exec # " + i);
				Thread.sleep(500);// Blocked : on sleep
			}
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " err " + e);
		}
		System.out.println(" exec over  " + Thread.currentThread().getName());

	}//DEAD

}
