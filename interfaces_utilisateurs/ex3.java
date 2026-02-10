import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import java.io.*;

class ex3 {

	public void readAndDisplayFile(JFrame f) {
		try (Reader in = new FileReader("./awt.md")) {
			String s = in.readAllAsString();
			JTextArea t = new JTextArea(s);
			t.setLineWrap(true);

			f.add(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ex3 instance = new ex3();

		JFrame f = new JFrame();
		f.setSize(500, 200);
		JButton b1 = new JButton("My button");
		JButton b2 = new JButton("My button 2");
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		instance.readAndDisplayFile(f);

		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;
		menuBar = new JMenuBar();
		menu = new JMenu("A Menu");
		menuBar.add(menu);
		menuItem = new JMenuItem("my menu item");
		menu.add(menuItem);

		f.setJMenuBar(menuBar);
		f.setVisible(true);
	}

}
