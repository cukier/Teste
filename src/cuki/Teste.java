package cuki;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste extends JApplet implements KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int x1 = 10, x2 = 10;
	public newThread thread1 = new newThread("thread1");

	public void init() {
		addKeyListener(this);
		setSize(100, 100);
	}

	public void paint(Graphics grap) {
		super.paint(grap);
		grap.setColor(Color.BLUE);
		grap.fillRect(0, 0, 100, 100);
		grap.setColor(Color.darkGray);
		grap.fillRect(x1, x2, 10, 10);
	}

	public void keyPressed(KeyEvent arg0) {
		x1 = x1 + 10;
		thread1.start();
		while (thread1.isAlive() == true) {
		}
		repaint();
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}

}

class newThread extends Thread {

	public newThread(String name) {
		super(name);
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
