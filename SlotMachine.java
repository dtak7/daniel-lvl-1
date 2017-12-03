import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	public static void main(String[] args) {
		SlotMachine sm = new SlotMachine();
	}

	public SlotMachine() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JButton spin = new JButton();
		spin.setText("SPIN");
		spin.addActionListener(this);
		frame.setSize(1000, 268);

		JLabel slotLabel = new JLabel();
		for (int i = 0; i < 3; i++) {
			int ran = new Random().nextInt(3);

			if (ran == 0) {
				String bananaImage = "banana.png";
				try {
					slotLabel = createLabelImage(bananaImage);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					slotLabel.setText(null);
				}
			}
			if (ran == 1) {
				String cherry2Image = "cherry2.jpg";
				try {
					slotLabel = createLabelImage(cherry2Image);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					slotLabel.setText(null);
				}
			}
			if (ran == 2) {
				String orangeImage = "orange.jpg";
				try {
					slotLabel = createLabelImage(orangeImage);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					slotLabel.setText(null);
				}
			}
			if (i == 0) {
				label = slotLabel;
			} else if (i == 1) {
				label1 = slotLabel;
			} else {
				label2 = slotLabel;
			}
		}

		label.setVisible(true);
		label1.setVisible(true);
		label2.setVisible(true);
		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		panel.add(slotLabel);
		panel.add(spin);
		frame.add(panel);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//This is the button listener
		System.out.println("hi");
	}
}
