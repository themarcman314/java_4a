import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ex1 extends JFrame implements ActionListener {
	private JButton[] buttongrid;
	private JComboBox comboBox;
	private JPanel top_panel;
	private JPanel bottom_panel;

	public ex1(final Color start) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		top_panel = new JPanel(new GridLayout(8, 8));
		add(top_panel, BorderLayout.CENTER);
		bottom_panel = new JPanel(new BorderLayout());
		String[] color_strings = { "green", "red", "blue" };
		comboBox = new JComboBox(color_strings);
		comboBox.addActionListener(this);
		bottom_panel.add(comboBox);
		add(bottom_panel, BorderLayout.SOUTH);

		setColor(new Color(0, 255, 0));
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		Color starting_color = new Color(0, 255, 0);
		new ex1(starting_color);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		String selected_box = (String) cb.getSelectedItem();
		switch (selected_box) {
			case "green":
				setColor(new Color(0, 255, 0));
				break;
			case "red":
				setColor(new Color(255, 0, 0));
				break;
			case "blue":
				setColor(new Color(0, 0, 255));
				break;
			default:
				break;
		}

	}

	void setColor(final Color start) {
		top_panel.removeAll();
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
			top_panel.add(buttongrid[index]);
		}
		top_panel.revalidate();
		top_panel.repaint();
	}
}
