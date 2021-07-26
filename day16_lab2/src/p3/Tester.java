package p3;

public class Tester {

	public static void main(String[] args) {
		try {
			System.out.println(Thread.currentThread());// Thread' toString : main 5 main
			//create instance of runnable task
			MyRunnableTask task=new MyRunnableTask();//runnable : 1 (main)
			//attach thrd to the runnable class instance : Thread(Runnable task, String name)
			Thread t1=new Thread(task,"one");
			Thread t2=new Thread(task,"two");
			Thread t3=new Thread(task,"three");
			Thread t4=new Thread(task,"four");//runnable : 1  (NEW : 4)
			t1.start();
			t2.start();			
			t3.start();			
			t4.start();//runnable : 1+ 4(5)
			
			
				// dummy B.L for main
			for (int i = 0; i < 10; i++) {
				System.out.println("thrd " + Thread.currentThread().getName() + " exec # " + i);
				Thread.sleep(100);// Blocked : on sleep
			}
			System.out.println("t1 is alive "+t1.isAlive()+" t4 is alive "+t4.isAlive());//t t
			System.out.println("main is waiting for child thrds to finish exec....");
			// join
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			System.out.println("t1 is alive "+t1.isAlive()+" t4 is alive "+t4.isAlive());//f f
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
