import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Leaugueinvasers {
	JFrame frame;
	int width = 500;
	int height = 800;

	public void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Leaugueinvasers bob = new Leaugueinvasers();
	}

	public Leaugueinvasers() {
		frame = new JFrame();
		int width = 500;
		int height = 800;
		frame.setSize(width, height);
		setup();
	}

}
