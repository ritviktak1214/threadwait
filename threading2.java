
public class threading2 {
public static void printnumber1() {
	for (int i = 1; i<=10;i++) {
		System.out.print(i+" ");
	}System.out.println(" ");
}
public static void printnumber2() {
	for(int r = 10;r>=1;r--) {
		System.out.print(r+" ");
	}System.out.println("  ");
}
public static void main(String[]args) {
	Thread one = new Thread(threading2::printnumber1);
	Thread two = new Thread(threading2::printnumber2);
	one.start();
	two.start();
}
}
