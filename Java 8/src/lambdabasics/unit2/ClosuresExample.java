package lambdabasics.unit2;

/*
 * 26 May 2022
 * https://youtu.be/WcLum7g6ImU?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */

public class ClosuresExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		/*
		 * Java 7
		 * doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i+b);
			}
		});*/
		
		
		//Java 8
		doProcess(a,i -> System.out.println(a + i));
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	
	void process(int i);
}
