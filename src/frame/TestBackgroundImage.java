package frame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestBackgroundImage {

	@SuppressWarnings("serial")
	public static void main(String[] args) {

		JPanel contentPane = new JPanel() {
			protected void paintComponent(Graphics g) {

				Image img = null;
				try {
					img = ImageIO.read(new File("src/img/fundo.jpg"));
					System.out.println(img.getProperty("", this));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g.drawImage(img, 0, 0, this);
			};
		};

		JFrame frame = new JFrame();

		frame.setContentPane(contentPane);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
