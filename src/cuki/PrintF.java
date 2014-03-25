package cuki;

import java.util.Date;

public class PrintF {

	public static void main(String[] args) {

		PrintF t = new PrintF();

		for (int cont = 0; cont <= 10; cont++) {
			synchronized (t) {
				try {
					t.wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(new Date().toString());
		}
	}
}
