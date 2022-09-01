package yate;

public class Contador extends Thread {
	private int i=0;
	public void run() {
		while (i<=70) {
		i++;
		}
		System.out.println(i+"s");
	}
	public int getI() {
		return i;
	}
}
