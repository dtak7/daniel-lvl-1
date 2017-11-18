

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class SimpleCalculator implements ActionListener {
public static void main(String[] args) {
	new SimpleCalculator();
}

JTextField text = new JTextField(15);
JTextField text2 = new JTextField(15);
JLabel label = new JLabel();
JButton button = new JButton();
JButton button2 = new JButton();
JButton button3=new JButton();
JButton button4 = new JButton();

public SimpleCalculator() {
	JFrame frame = new JFrame();
	
	frame.setVisible(true);
	frame.setSize(700, 700);
	
	JPanel panel = new JPanel();
	
	
	button.setText("addition");
	button2.setText("subtraction");
	button3.setText("multiplacation");
	button4.setText("division");
	button.addActionListener(this);
	button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    
    label.setOpaque(true);  
    label.setVisible(true);
    
    

	panel.add(label);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	frame.add(panel);
	panel.add(text);
	panel.add(text2);
	panel.setSize(700, 700);
	frame.add(panel);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== button) {
	
int num1 = Integer.parseInt(text.getText());
int num2 = Integer.parseInt(text2.getText());
 num1=num1+num2;
 label.setText(num1+"");
}
	if(e.getSource()==button2) {
		int num1 = Integer.parseInt(text.getText());
		int num2 = Integer.parseInt(text2.getText());
		 num1=num1-num2;
		 label.setText(num1+"");
	}
	if(e.getSource()==button3) {
		int num1 = Integer.parseInt(text.getText());
		int num2 = Integer.parseInt(text2.getText());
		 num1=num1*num2;
		 label.setText(num1+"");
	}
	if(e.getSource()==button4) {
		int num1 = Integer.parseInt(text.getText());
		int num2 = Integer.parseInt(text2.getText());
		 num1=num1/num2;
		 label.setText(num1+"");
	}
}
 
}
