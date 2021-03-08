package hw09_threads;

/*
 * Practical Task #2. 
 * Output two messages «Hello, world» and «Peace in the peace» 
 * 5 times each with the intervals of 2 seconds, and the second - 3 seconds. 
 * After printing messages, print the text «My name is …»
 */
public class Practical2 extends Thread {
	
	public void run() {
		String msg1 = "Hello, world";
		String msg2 = "Peace in the peace";
		String msg3 = "My name is Anastasia";
		
		int i = 0;
		while (i < 5) {
			System.out.println(msg1);
			i++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(msg2);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}		
		
		System.out.println(msg3);		
	}

	public static void main(String[] args) {
		Practical2 p = new Practical2();
		p.start();

	}
}
