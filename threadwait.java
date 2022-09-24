//java code to pause the excution of a thread
class ThreadPause{
	//method to pause the string 
	//here we will pause in sec
	public void wait(int sec) {
		try {Thread.currentThread().sleep(sec*1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//main code
 public class threadwait{
	 public static void main(String[]args) {
		 ThreadPause TP = new ThreadPause();
		 System.out.println("waiting for 1 sec");
		 TP.wait(1);
		 System.out.println("hello");
		 
		 System.out.println("waiting for 4 sec");
		 TP.wait(4);
		 System.out.println("how are you");
		 
	 }
 }
