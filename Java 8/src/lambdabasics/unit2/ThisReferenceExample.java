package lambdabasics.unit2;

/*
 * 26 May 2022
 * https://youtu.be/x9ovGHK7r2E?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */

public class ThisReferenceExample {

	public static void main(String[] args) {

		ThisReferenceExample example = new ThisReferenceExample();

		// Java 7
		/*example.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				// TODO Auto-generated method stub
				System.out.println("Value of i : " + i);
				System.out.println(this);
			}
		
		public String toString() {
			return "THis is the anonymous inner class";
		}		
		
		});*/
		
		//java 8
		example.doProcess(10, i -> {
			System.out.println("Value of i is : " + i);
			//System.out.println(this); //This will not work
		});
		
	}
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
}
