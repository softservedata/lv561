package hw09_threads;

/*
 * Homework Task #3.
 * Create a thread «one», which would start the thread «two», 
 * which has to output its number («Thread number two») 3 times 
 * and create thread «three», 
 * which would to output message «Thread number three» 5 times. 
 */
public class Homework3 {

	public static void main(String[] args) {
		One one = new One();
		one.start();

	}
}

class One extends Thread {
	
	public void run() {
		Two two = new Two();
		two.start();
	}
}

class Two extends Thread {
	
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		class Three extends Thread {
			
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println("Thread number three");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}			
		}
		
		Three three = new Three();
		three.start();
		
	}
}


