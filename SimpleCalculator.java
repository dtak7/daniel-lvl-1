

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
public static void main(String[] args) {
	new SimpleCalculator();
}
public SimpleCalculator() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3=new JButton();
	JButton button4 = new JButton();
	JTextField text = new JTextField(15);
	JTextField text2 = new JTextField(15);
	button.setText("addition");
	button2.setText("subtraction");
	button3.setText("multiplacation");
	button4.setText("division");
	button.addActionListener(this);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	frame.add(panel);
	panel.add(text);
	panel.add(text2);
	panel.setSize(700, 700);
	frame.setVisible(true);
	frame.setSize(700, 700);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi");
} 
}
