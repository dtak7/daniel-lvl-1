import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
    JFrame frame = new JFrame();
    JLabel label = new JLabel(Character.toString(currentLetter));
	public static void main(String[] args) {
		new TypingTutor();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	

	public TypingTutor() {

		
		frame.setVisible(true);
		frame.setSize(700, 600);
		frame.addKeyListener(this);
		System.out.println(Character.toString(currentLetter));
		label.setText(Character.toString(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVisible(true);
		label.setOpaque(true);
		frame.add(label);
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
		if (e.getKeyChar() == (currentLetter)) {
			System.out.println("correct");
			label.setBackground(Color.GREEN);
			//frame.repaint();
		}
		else{
			label.setBackground(Color.red);
		}
		currentLetter = generateRandomLetter();
		label.setText(Character.toString(currentLetter));
	}

}
