import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Sensitive implements  KeyListener{
	
	public static void main(String[] args) {
		new Sensitive();
			
	}	
			public Sensitive() {  	
				JFrame frame =new JFrame();
				frame.addKeyListener(this);
				frame.setVisible(true);
			}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	speak ("yo"); 
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		speak ("yoyo"); 
	}
	/* Don’t change this…. */
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

}
