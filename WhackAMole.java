import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private int num = 159;
	JButton button;
	JButton button2;

	public static void main(String[] args) {
		WhackAMole whack = new WhackAMole();
		whack.drawButtons(whack.num);
		whack.frame.setVisible(true);
	}

	WhackAMole() {
		frame.setSize(700, 700);
		frame.setVisible(true);
		frame.setTitle("Whack the Mole!");
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void drawButtons(int num) {
		Random rand = new Random();

		int n = rand.nextInt(num) + 1;
		for (int i = 0; i < num; i++) {
			if (n == i) {
				button2 = new JButton("mole!");
				button2.addActionListener(this);
				panel.add(button2);
			}
			button = new JButton();
			button.addActionListener(this);
			panel.add(button);

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random insults = new Random();
		int n = insults.nextInt(5) + 1;
		if (e.getSource() == button2) {
			System.out.println("good job");
			frame.dispose();
			frame = new JFrame();
			panel = new JPanel();
			frame.add(panel);
			drawButtons(num);
			frame.setVisible(true);
			frame.setSize(700, 700);
			frame.setTitle("Whack the MOLE!");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (n == 1) {
			System.out.println("you're an imbicle");
		} else if (n == 2) {
			System.out.println("you're a misalacation of reasources");
		} else if (n == 3) {
			System.out.println("you dumbo");
		} else if (n == 4) {
			System.out.println("what a moron!");
		} else if (n == 5) {
			System.out.println("If you were twice as smart, you'd still be stupid.");

		}
	}
}
