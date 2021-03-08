package hw09_threads;

/*
 * Practical Task #1. 
 * Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
 */
public class Practical1 extends Thread {

	public void run() {
		String text = "I study Java";
		
		int i = 0;
		while(i < 10) {
			System.out.println(text);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}		
	}
	
	public static void main(String[] args) {
		Practical1 p = new Practical1();
		p.start();
	}

}
