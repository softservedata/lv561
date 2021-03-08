package hw09_threads;

/*
 * Homework Task #2. 
 * Cause a deadlock. 
 * Organize the expectations of ending a thread in main(), 
 * and make the end of the method main() in this thread.
 */
public class Homework2 {

	public static void main(String[] args) {
		final String str1 = "first msg...";
		final String str2 = "second msg...";
		
		Thread t1 = new Thread() {
			
			public void run() {
				synchronized(str1) {
					System.out.println("Thread 1: locked msg1");
					try {
						Thread.sleep(100);
					} catch (Exception e) {}
					
					synchronized(str2) {
						System.out.println("Thread 1: locked msg2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			
			public void run() {
				synchronized (str2) {
					System.out.println("Thread 2: locked msg2");
					try {
						Thread.sleep(100);
					} catch (Exception e) {}
					
					synchronized(str1) {
						System.out.println("Thread 2: locked msg1");
					}
				}
			}
		};
		
		t1.start();
		t2.start();

	}
}
