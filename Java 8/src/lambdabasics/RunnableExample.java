package lambdabasics;

/*
 * 23 May 2022
 */

public class RunnableExample {

	public static void main(String[] args) {

		Thread mythread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
		});
		
		mythread.run();
		
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.start();
		
	}

}
