import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

public class ex2 extends JFrame implements MouseListener {
	private JTextArea text_area;
	private JScrollPane scroll_pane;

	public ex2() {
		addMouseListener(this);
		setSize(500, 300);
		text_area = new JTextArea(7, 1);
		text_area.setEditable(false);
		scroll_pane = new JScrollPane(text_area);
		setPreferredSize(new Dimension(450, 110));
		add(scroll_pane, BorderLayout.SOUTH);
		setVisible(true);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		text_area.append("mouse exited\n");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		text_area.append("mouse pressed\n");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		text_area.append("mouse entered\n");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		text_area.append("mouse released\n");

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		text_area.append("mouse clicked\n");

	}

	public static void main(String[] args) {
		new ex2();
	}

}
