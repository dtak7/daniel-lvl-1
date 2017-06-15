import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Gamepanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	GameObjects gObs;

	Gamepanel() {
		timer = new Timer(1000 / 60, this);
		gObs = new GameObjects();
	}

	public void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		gObs.update();
	}

	public void paintComponent(Graphics g) {
		gObs.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you are in the games");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("only one will survive");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("HAVE A NICE DAY!!!");
	}
}
