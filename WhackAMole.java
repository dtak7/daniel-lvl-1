import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private int num = 159;

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

		int n = rand.nextInt(50) + 1;
		for (int i = 0; i < num; i++) {
			if(n==i){
				JButton button2 = new JButton("mole!");
				panel.add(button2);
			}
			JButton button = new JButton();
			panel.add(button);
			
		}

	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

}