package org.lambda;

public class ThreadDemo {

	public static void main(String[] args) {
		Runnable thread1 = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("Value of i is: " + i);
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(thread1);
		t.setName("shubham");
		t.start();
		
		
		Runnable thread2 = () -> {
			try {
				for(int i=1; i<=10;i++) {
					System.out.println(2 * i);
					Thread.sleep(2000);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		};
		Thread t1 = new Thread(thread2);
		t1.start();
	}

}
