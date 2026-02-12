import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import java.io.*;

class ex3 {
	private JMenu menu;

	public void readAndDisplayFile(JFrame f) {
		JTextArea t = new JTextArea();
		JMenuBar menuBar;
		JMenu menu;
		menuBar = new JMenuBar();
		menu = new JMenu(); // initialize just in case

		f.setJMenuBar(menuBar);
		f.setVisible(true);
		t.setLineWrap(true);
		f.add(t);
		try (FileReader in = new FileReader("./entree")) {
			BufferedReader buffered_in = new BufferedReader(in);
			String s = buffered_in.readLine();
			int count = 0;
			while (s != null) {
				if (count % 3 == 0) { // menu
					menu = new JMenu(s);
					menuBar.add(menu);
				} else { // menu item
					JMenuItem menuItem;
					menuItem = new JMenuItem(s);
					menu.add(menuItem);
				}
				t.append(s + "\n");
				s = buffered_in.readLine();
				count++;
			}
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

	}

}
