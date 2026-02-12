import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.*;

public class ex4 extends JFrame implements ActionListener {
	private JButton buttons[];
	private JFileChooser chooser;
	private JTextArea text_area;
	private JScrollPane scroll_pane;

	public ex4() {
		setSize(500, 300);
		// instantiate file chooser
		chooser = new JFileChooser();
		// create array of JButtons
		buttons = new JButton[2];
		// instantiate JButtons and set them to array elements
		buttons[0] = new JButton();
		buttons[1] = new JButton();
		buttons[0].setText("Ouvrir Fichier");
		buttons[1].setText("Quitter");
		// add listeners
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		add(buttons[0], BorderLayout.WEST);
		add(buttons[1], BorderLayout.EAST);
		text_area = new JTextArea();
		text_area.setEditable(false);
		scroll_pane = new JScrollPane(text_area);
		add(scroll_pane);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons[0]) {
			int returnVal = chooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File choosen_file = chooser.getSelectedFile();
				System.out.println("You chose to open this file: " + choosen_file);
				try (FileInputStream fis = new FileInputStream(choosen_file)) {
					text_area.setText(new String(fis.readAllBytes(), StandardCharsets.UTF_8));
				} catch (IOException ex) {
					ex.printStackTrace();
				}

			}
		} else if (e.getSource() == buttons[1])
			System.exit(0); // quit entire JVM

	}

	public static void main(String[] args) {
		new ex4();
	}
}
