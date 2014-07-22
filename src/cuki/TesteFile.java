package cuki;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteFile {

	public static void main(String[] args) throws IOException {

		// String current = new java.io.File(".").getCanonicalPath();
		// System.out.println("Current dir:" + current);
		// String currentDir = System.getProperty("user.dir");
		// System.out.println("Current dir using System:" + currentDir);

		File f = new File("src/ico"); // current directory

		File[] files = f.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.print("directory:");
			} else {
				System.out.print("     file:");
			}
			System.out.println(file.getCanonicalPath());
		}

		File f1 = new File("src/ico/arrow123.png");

		System.out.println(f1.getCanonicalPath());

		BufferedImage img = ImageIO.read(f1);

		System.out.println(img.toString());

		JFrame frame = new JFrame();

		JPanel contentPane = new JPanel();

		frame.setContentPane(contentPane);

		// URL url = TesteFile.class.getResource("/ico/arrow123.png");
		// System.out.println(url.toString());
		//
		// BufferedImage img = ImageIO.read(new File(url.toString()));
		// System.out.println(img.toString());

		// File f = new File("/ico/arrow123.png");
		//
		// BufferedImage img = null;
		// try {
		// img = ImageIO.read(f);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// System.out.println(img.toString());

	}
}
