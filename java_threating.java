
public class java_threating {
	//method to print numbers from 1to10
	public static void printnumbers() {
		for(int i = 1;i<=10;i++) { 
		System.out.print(i+" ");
		//printing new line
		}System.out.println("");
	}
public static void main(String[]args) {
	Thread one = new Thread(java_threating::printnumbers);
	Thread two = new Thread(java_threating::printnumbers);
	//starting the threads
	one.start();
	two.start();
}
}