import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingtutor implements KeyListener {
	public static void main(String[] args) {
		new typingtutor();
	}
	char currentLetter = generateRandomLetter();

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	JLabel label = new JLabel(Character.toString(currentLetter));

	public typingtutor() {
		
		JFrame frame = new JFrame();
		frame.add(label);
		frame.setVisible(true);
		frame.setSize(700, 600);
		frame.addKeyListener(this);
		System.out.println(Character.toString(currentLetter));
		label.setText(Character.toString(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(currentLetter);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(Character.toString(currentLetter));
	if(equals(currentLetter)) {
		System.out.println("correct");
	}
	}

}
