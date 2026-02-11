import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class ex1 extends JFrame implements ActionListener { // implement ActionListener instead
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JLabel l;

	public ex1() {
		b1 = new JButton("Masculin");
		b2 = new JButton("Feminin");
		b3 = new JButton("Indetermine");
		l = new JLabel("No button pressed yet");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(l);
		this.setLayout(new FlowLayout());
		this.setTitle("my window");
		this.setSize(500, 500);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			l.setText(b1.getText());
		else if (e.getSource() == b2)
			l.setText(b2.getText());
		else if (e.getSource() == b3)
			l.setText(b3.getText());
	}

	public static void main(String[] args) {
		new ex1();
	}
}
