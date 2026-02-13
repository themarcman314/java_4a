import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ex1 extends JFrame implements ActionListener {
	private JButton[] buttongrid;

	public ex1(final Color start) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new GridLayout(8, 8));
		Color c = new Color(start.getRGB());
		buttongrid = new JButton[64];
		int steps = buttongrid.length;
		for (int index = 0; index < steps; index++) {
			buttongrid[index] = new JButton();
			float t = index / (float) (steps - 1);
			int r = Math.round(start.getRed() + t * (255 - start.getRed()));
			int g = Math.round(start.getGreen() + t * (255 - start.getGreen()));
			int b = Math.round(start.getBlue() + t * (255 - start.getBlue()));
			c = new Color(r, g, b);
			buttongrid[index].setBackground(c);
			add(buttongrid[index]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		Color starting_color = new Color(0, 255, 0);
		new ex1(starting_color);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
