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
	Gamepanel game;

	public void setup() {
		frame.addKeyListener(game);
		frame.add(game);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.startGame();
	}

	public static void main(String[] args) {
		Leaugueinvasers bob = new Leaugueinvasers();
	}

	public Leaugueinvasers() {
		frame = new JFrame();
		game = new Gamepanel();
		int width = 500;
		int height = 800;
		frame.setSize(width, height);
		setup();

	}

}
