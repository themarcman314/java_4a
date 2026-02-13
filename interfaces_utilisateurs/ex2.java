import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class ex2 extends JFrame {
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem menuitem;

	public ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 100);
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		menu = new JMenu("bouton1");
		menuitem = new JMenuItem("sous-menu1");
		menu.add(menuitem);
		menubar.add(menu);
		menu = new JMenu("bouton2");
		menuitem = new JMenuItem("sous-menu2");
		menu.add(menuitem);
		menubar.add(menu);

		menuitem = new JMenuItem();
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex2();

	}
}
