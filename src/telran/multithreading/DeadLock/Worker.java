package telran.multithreading.DeadLock;

public class Worker extends Thread {
	static Object resource1 = new Object();
	static Object resource2 = new Object();
	static int nRuns = 1;

	void f1() {
		synchronized (resource1) {
			System.out.println("f1-1 " +Thread.currentThread().getName());
			synchronized (resource2) {
				System.out.println("f1-2 " +Thread.currentThread().getName());

			}
		}
	}

	void f2() {
		synchronized (resource2) {
			System.out.println("f2-1 " +Thread.currentThread().getName());
			synchronized (resource1) {
				System.out.println("f2-2 " +Thread.currentThread().getName());
			}
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < nRuns; i++) {
			f1();
			f2();
		}
	}
}
