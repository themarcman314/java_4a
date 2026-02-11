import javax.swing.*;
import java.awt.event.*;

public class test extends JFrame implements MouseListener {
	public test() {
		addMouseListener(this);
		setTitle("my window");
		setSize(500, 500);

	}

	public void mouseExited(MouseEvent evt) {
		System.out.println("mouse exited");
	};

	public void mouseReleased(MouseEvent evt) {
		System.out.println("mouse released");
	};

	public void mouseClicked(MouseEvent evt) {
		System.out.println("mouse clicked");
	};

	public void mouseEntered(MouseEvent evt) {
		System.out.println("mouse entered");
	};

	public void mousePressed(MouseEvent evt) {
		System.out.println("mouse pressed");
	};

	public static void main(String[] args) {
		test fr = new test();
		fr.setVisible(true);
	}

}
