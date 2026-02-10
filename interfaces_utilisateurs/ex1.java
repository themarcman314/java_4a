import java.awt.*;

class ex1 {
	public static void main(String[] args) {
		Frame f = new Frame("my frame");
		BorderLayout b = new BorderLayout();
		FlowLayout l = new FlowLayout();
		f.setLayout(l);
		Button b1 = new Button("Click Me!");
		Button b2 = new Button("Click Me 2!");
		// b1.setBounds(50, 150, 100, 30);
		// b2.setBounds(300, 150, 100, 30);
		f.setSize(500, 200);
		f.add(b1);
		f.add(b2);
		f.setLocation(500, 500);

		f.setVisible(true);

	}
}
