import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class candyman implements ActionListener {
public static void main(String[] args) {
	 new candyman();
}

public candyman () {
	JFrame frame = new JFrame();
	JButton button = new JButton("Candy man (Donʻt press 5 times!!!)" );
	frame.add(button);
	frame.setVisible(true);
	frame.setSize(600, 600);
	button.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

int i = 0;

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	i=i+1;
	if(i==5) {
		JOptionPane.showMessageDialog(null, "ROAR");
	i=0;
	}
}
}

