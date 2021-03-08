package hw09_threads;

/*
 * Homework Task #1.
 * Run three threads and output there different messages for 5 times. 
 * The third thread supposed to start after finishing working of the two previous threads.
 */
public class Homework1 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		
		t1.start();
        t2.start();
        try{
            t2.join();
        } catch (Exception e){}
        
        t3.start();
	}

}

class MyThread1 extends Thread {
	
	public void run() {
		String msg1 = "Running first message...";
		for(int i = 0; i < 5; i++) {
			System.out.println(msg1);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	
	public void run() {
		String msg2 = "Running second message...";
		for(int i = 0; i < 5; i++) {
			System.out.println(msg2);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread3 extends Thread {
	
	public void run() {
		String msg3 = "Running third message...";
		for(int i = 0; i < 5; i++) {
			System.out.println(msg3);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}