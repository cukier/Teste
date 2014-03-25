package cuki;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class TabbedPane extends JPanel {

	JPanel jp = new JPanel(new MigLayout());

	public TabbedPane() {

		JLabel fn = new JLabel("First Name");
		JTextField fnT = new JTextField("nome", 15);

		JLabel sn = new JLabel("Surname");
		JTextField snT = new JTextField("sobrenome", 15);

		JLabel addr = new JLabel("Address");
		JTextField addrT = new JTextField("endereco", 35);

		JButton ok = new JButton("Ok");

		setLayout(new FlowLayout());
		add(fn);
		add(fnT);
		add(sn, "gap unrelated");
		add(snT, "wrap");
		add(addr);
		add(addrT, "wrap, grow");
		add(ok, "span");

	}

	public static void main(String[] args) {

		TabbedPane panel = new TabbedPane();
		JFrame frame = new JFrame();

		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
