import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ex3 extends JFrame implements ActionListener {
	private JButton[] buttons;

	public ex3() {
		buttons = new JButton[64];
		setLayout(new GridLayout());
		setLayout(new GridLayout(8, 8));
		setSize(500, 500);

		int green_intensity = 255;
		int blue_intensity = 0;
		int red_intensity = 0;
		for (int i = 0; i < buttons.length; i++) {
			// TODO: set color buttons
			System.out.printf("r: %d b: %d\n", red_intensity, blue_intensity);
			Color c = new Color(red_intensity, green_intensity, blue_intensity);
			red_intensity += 255 / 63;
			blue_intensity += 255 / 63;
			buttons[i] = new JButton();
			buttons[i].setBackground(c);
			add(buttons[i]);
		}
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new ex3();
	}
}
